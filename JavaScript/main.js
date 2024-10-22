//var Nombre = "Javier";
//var Apellido = "Karim";    "como declarar variables"
//var Edad = 19;
//var altura = 167;


//document.write(presentacion); "escribir directo en documento, para consola es console.log("hola")"

// Como escribir una funcion básica 
/*function Mostrardatos(Nombre,Apellido,Edad,altura){
    var datos = document.getElementById("datos");
    let presentacion = Nombre + " " + Apellido + " " + " y tengo " + Edad + " años"; 
    datos.innerHTML += `<h1> ${presentacion}</h1><p> mido ${altura} cm.`;
    if (altura >= 170){
        datos.innerHTML += `<p> altura promedio</p>`;
    } else if (altura <= 170){
        datos.innerHTML += `<p> tas chaparro bro</p>`;
    }
}*/   

// funcion dentro de otra funcion

function Mostrardatos(Nombre,Apellido,Edad,altura){
    let presentacion = Nombre + " " + Apellido + " " + " y tengo " + Edad + " años"; 
    var misDatos = `<h1> ${presentacion}</h1><p> mido ${altura} cm.`;
    return misDatos;
}

function Imprimir(){
    var datos = document.getElementById("datos");
    datos.innerHTML = (Mostrardatos("Javier","Karim",19,177));
}

Imprimir();

// Ciclo for básico

/*for (var i = 0; i<=100; i++){
    datos.innerHTML += `<p> Cuenta: ${i}</p>`
}*/

//Arrays

var amigos = ["Angel ","Lalo ","Elias "];
alert(amigos[1]);
/*
for (i= 0; i<amigos.length; i++){
    document.write(amigos[i]);
}*/

// Funciones de flecha (misma sintaxis pero con una flecha en los corchetes y se quita la palabra function)

amigos.forEach((nombre) => {
    document.write(nombre + `<br>`);
});    
