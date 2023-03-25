const data = [
    {
        question:"What does HTML stand for ?",
        a:"Hypertext Markup Language",
        b:"Hypertext Markdown Language",
        c:"Hyperloop Machine Language",
        d:"Helicopters terminals Motorboats lamborginis",
        correct:"a",
    },
    {
        question:"what does css stands for?",
	    a: "centrak style sheets",
	    b:"cascading style sheets",
	    c:"cascading simple sheets",
	    d: "cars suv sailboats",
	    correct :"b",   
    },
    {
        question:"who is making the web standards ?",
	    a: "Google",
	    b:"MIcrosoft",
	    c:"Mozilla",
	    d: "the world web",
	    correct :"d",
    },
    {
        question:"Which element is used for paragraph tag ?",
        a:"<p></p>",
        b:"<div></div>",
        c:"<h1></h1>",
        d:"<span></span>",
        correct:"a",
    },
    {
        question:"What is the smallest header in HTML by default?",
        a:"h2",
        b:"h3",
        c:"h6",
        d:"h1",
        correct:"c",
    },
]
const quiz = document.getElementById("quiz");
const answerELs = document.querySelectorAll(".ans");
const questionE1 = document.getElementById("question");
const optionA = document.getElementById("optionA");
const optionB = document.getElementById("optionB");
const optionC = document.getElementById("optionC");
const optionD = document.getElementById("optionD");

const submitBtn = document.getElementById("submit");

let currentQuiz = 0
let score = 0

loadQuiz()

function loadQuiz(){
    deselectAnswers()
    const currentQuizData = data[currentQuiz]
    questionE1.innerText = currentQuizData.question
    optionA.innerText = currentQuizData.opt-a
    optionB.innerText = currentQuizData.opt-b
    optionC.innerText = currentQuizData.opt-c
    optionD.innerText = currentQuizData.opt-d

}
function deselectAnswers(){
    answerELs.forEach((answerEL)=>(
        answerEL.checked = false
    ))
}
function getSelected(){
    let answer
    answerELs.forEach((answerEL)=>{
        if(answerEL.checked){
            answer=answerEL.id
        }
    })
    return answer
}

submitBtn.addEventListener("click",()=>{
    const answer = getSelected()

    if(answer){
        if(answer === data[currentQuiz].correct){
            score++
        }
        currentQuiz++

        if (currentQuiz < data.length){
            loadQuiz()
        }
        else{
           quiz.innerHTML =`
           <h2>You Answered ${score}/${data.length} Questions correctly</h2>
           
           <button onclick="location.reload()">Do it Again</button>
           `
        }
    }
})