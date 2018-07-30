var xhr=new XMLHttpRequest();

window.onload=
()=>
{
    //Var definition to asigne to the buttons
    document.getElementById("btnSum").onclick=sumNumbers;

}

function sumNumbers()
{
    //this function connects to the servlet & adds the numbers and returns as an answer dynamical web content

    //Catching the values of the textboxes
    var txtNum1=document.getElementById("txtNum1").value;
    var txtNum2=document.getElementById("txtNum2").value;

    //Send the asincron process
    //xhr.responseType="document";
    xhr.open("GET","SumServlet?txtNum1="+txtNum1+"&txtNum2="+txtNum2,true);

    //Check if the process ends successfuly
    xhr.onload=functionCallBack;

    //Send the process
    xhr.send();
}
function functionCallBack()
{
    document.getElementById("resultSum").innerHTML=xhr.responseText;
}
