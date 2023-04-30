const ball = document.getElementById('ball');
let ballX = Math.floor(Math.random() * window.innerWidth);
let ballY = Math.floor(Math.random() * window.innerHeight);
ball.style.left = ballX + 'px';
ball.style.top = ballY + 'px';

const speed = 10;
document.addEventListener('keydown', (event) => {
    if (event.key === 'w' || event.key === 'W') {
        ballY -= speed;
        if (ballY < 0) ballY = 0;
    } else if (event.key === 'a' || event.key === 'A') {
        ballX -= speed;
        if (ballX < 0) ballX = 0;
    } else if (event.key === 's' || event.key === 'S') {
        ballY += speed;
        if (ballY > window.innerHeight - 50) ballY = window.innerHeight - 50;
    } else if (event.key === 'd' || event.key === 'D') {
        ballX += speed;
        if (ballX > window.innerWidth - 50) ballX = window.innerWidth - 50;
    }
    ball.style.left = ballX + 'px';
    ball.style.top = ballY + 'px';
});