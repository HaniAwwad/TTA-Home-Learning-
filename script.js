let button=document.getElementById("Sign up");
button.addEventListener("click", function() {
    alert("I am clicking");
})

let Submit= document.getElementById("Submit");
let userName= document.getElementById("name").value;
let Email= document.getElementById("Email").value;
let mobileNumber= document.getElementById("mobileNumber").value;


/**changing text */
function check()
{
    //get value of input text
    // var user = document.getElementById("t1").value;
    //changing text value of HTML element-> innerText
    // == equality operator 
    if(userName=="")
    {
        document.getElementById("msg1").innerText = "Please enter your user Name";
    } 
    
    if(Email==""){
        document.getElementById("msg2").innerText = "Please enter your Email";
    }
    
    if(mobileNumber==""){
    document.getElementById("msg3").innerText = "Please enter your Mobile Number";
    }
    
}