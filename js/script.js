const counterval=document.getElementById('counter');
const increase_button=document.getElementById('increase');
const decrease_button=document.getElementById('decrease');

let count=0;

increase_button.addEventListener('click',increase_value);
decrease_button.addEventListener('click',decrease_value);

function update_button()
{
    counterval.innerText=count;
}

function increase_value()
{
    count++;
    update_button();
}

function decrease_value()
{
    count--;
    update_button();
}

