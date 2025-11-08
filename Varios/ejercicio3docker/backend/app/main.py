from fastapi import FastAPI
from backend.app.v1 import router as v1_router







@app.get("/")
def read_root():
    return{"Puta"}

app = FastAPI()