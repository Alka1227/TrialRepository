const canvas = document.querySelector("canvas")
const ctx = canvas.getContext("2d")
canvas.width = innerWidth
canvas.height = innerHeight

let Bolas = []
for(let i = 0;i < 11000; i++){
    Bolas.push(new bola(canvas.width/2, canvas.height/2))
}

function animar(){
    ctx.clearRect(0, 0, canvas.width, canvas.height)
    Bolas.forEach(bola =>{
        bola.dibujar()
        bola.mover()
    })

    requestAnimationFrame(animar)
}

animar()