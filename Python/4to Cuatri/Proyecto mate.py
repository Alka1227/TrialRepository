import tkinter as tk
import numpy as np
import matplotlib.pyplot as plt
from mpl_toolkits.mplot3d import Axes3D
from sympy import symbols, parse_expr, lambdify
from matplotlib.widgets import Slider

class VectorFieldPlotter:
    def __init__(self, master):
        self.master = master
        self.master.title("Vector Field Plotter")

        self.vector_field_equation = None
        self.range_values = (-10, 10)  
        self.scale = None
        self.representation = None
        self.dimensions = 3

        self.create_widgets()
        self.update_plot()  

    def create_widgets(self):
        tk.Label(self.master, text="Enter the vector field equation as a Python expression:").pack()
        self.equation_entry = tk.Entry(self.master)
        self.equation_entry.pack()

        tk.Label(self.master, text="Enter the range of values as a comma-separated triple (e.g., -10, 10):").pack()
        self.range_entry = tk.Entry(self.master)
        self.range_entry.pack()

        tk.Label(self.master, text="Enter scale for the vector field arrows (e.g., 1):").pack()
        self.scale_entry = tk.Entry(self.master)
        self.scale_entry.pack()

        tk.Label(self.master, text="Enter the type of graphical representation (arrows/lines/contours):").pack()
        self.representation_entry = tk.Entry(self.master)
        self.representation_entry.pack()

        tk.Button(self.master, text="Update Plot", command=self.update_plot).pack()
        tk.Button(self.master, text="2D", command=lambda: self.set_dimensions(2)).pack()
        tk.Button(self.master, text="3D", command=lambda: self.set_dimensions(3)).pack()

    def update_plot(self):
        equation = self.equation_entry.get()
        range_values = self.range_entry.get().split(',')
        scale = self.scale_entry.get()
        representation = self.representation_entry.get()

        try:
            expr = parse_expr(equation)
            self.vector_field_equation = [lambdify((symbols('x'), symbols('y'), symbols('z')), expr[i], 'numpy') for i in range(len(expr))]
            
            self.range_values = list(map(float, range_values))
            self.scale = float(scale)
            self.representation = representation

            self.plot_vector_field()
        except Exception as e:
            print(f"Error: {e}")
            self.vector_field_equation = []

    def plot_vector_field(self):
        if self.dimensions == 2:
            self.plot_2d()
        elif self.dimensions == 3:
            self.plot_3d()

    def plot_2d(self):
        x_vals = np.linspace(self.range_values[0], self.range_values[1], 20)
        y_vals = np.linspace(self.range_values[0], self.range_values[1], 20)

        X, Y = np.meshgrid(x_vals, y_vals)

        if len(self.vector_field_equation) >= 2:
            U = self.scale * self.vector_field_equation[0](X, Y, 0)
            V = self.scale * self.vector_field_equation[1](X, Y, 0)

            fig, ax = plt.subplots()
            ax.quiver(X, Y, U, V, scale=20, color='blue')  

            ax.set_xlabel('X-axis')
            ax.set_ylabel('Y-axis')
            ax.set_title("Vector Field - Arrows in 2D")
            plt.show()
        else:
            print("Vector field equation must have at least two components for 2D plotting.")

    def plot_3d(self):
        x_vals = np.linspace(self.range_values[0], self.range_values[1], 20)
        y_vals = np.linspace(self.range_values[0], self.range_values[1], 20)
        z_vals = np.linspace(self.range_values[0], self.range_values[1], 20)

        X, Y, Z = np.meshgrid(x_vals, y_vals, z_vals)

        if len(self.vector_field_equation) == 3:
            fig = plt.figure()
            ax = fig.add_subplot(111, projection='3d')

            for i in range(len(X)):
                for j in range(len(Y)):
                    for k in range(len(Z)):
                        x = X[i, j, k]
                        y = Y[i, j, k]
                        z = Z[i, j, k]
                        dx, dy, dz = self.scale * self.vector_field_equation[0](x, y, z), self.scale * self.vector_field_equation[1](x, y, z), self.scale * self.vector_field_equation[2](x, y, z)
                        ax.quiver(x, y, z, dx, dy, dz, length=0.1, normalize=True, color='blue')

            ax.set_xlabel('X-axis')
            ax.set_ylabel('Y-axis')
            ax.set_zlabel('Z-axis')
            ax.set_title("Vector Field - Arrows in 3D")
            plt.show()
        else:
            print("Vector field equation must have three components for 3D plotting.")

    def set_dimensions(self, dimensions):
        self.dimensions = dimensions
        self.plot_vector_field()

if __name__ == "__main__":
    root = tk.Tk()
    app = VectorFieldPlotter(root)
    root.mainloop()