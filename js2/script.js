const add_button=document.getElementById('add');
const subtract_button=document.getElementById('subtract');
const divide_button=document.getElementById('divide');
const multiply_button=document.getElementById('multiply');

add_button.addEventListener('click',add_values);
subtract_button.addEventListener('click',subtract_values);
divide_button.addEventListener('click',divide_values);
multiply_button.addEventListener('click',multiply_values);


function check_values()
{
    const number1=document.getElementById('num1').value;
    const number2=document.getElementById('num2').value;
    if (!Number.isInteger(Number(number1)) || !Number.isInteger(Number(number2))) 
    {
        alert('Please enter valid integers in both fields.');
        return null;
    }
    return { num1: parseInt(number1), num2: parseInt(number2) };
}

function add_values()
{
    const getinput=check_values();
    if(getinput)
    {
        const ans=getinput.num1+getinput.num2;
        alert(`Result : ${ans}`);
    }   
}
function subtract_values()
{
    const getinput=check_values();
    if(getinput)
    {
        const ans=getinput.num1-getinput.num2;
        alert(`Result : ${ans}`);
    }   
}
function multiply_values()
{
    const getinput=check_values();
    if(getinput)
    {
        const ans=getinput.num1*getinput.num2;
        alert(`Result : ${ans}`);
    }   
}
function divide_values()
{
    const getinput=check_values();
    if(getinput)
    {
        if(getinput.num2 === 0) 
        {
            alert('Cannot divide by zero.');
        }
        else
        {
            const ans=getinput.num1/getinput.num2;
            alert(`Result : ${ans}`);
        } 
    }
      
}