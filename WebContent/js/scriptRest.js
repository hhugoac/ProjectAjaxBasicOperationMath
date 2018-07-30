var xhr=new XMLHttpRequest();

window.onload=
()=>
{
    //Var definition to asigne to the buttons
    document.getElementById("btnRest").onclick=restNumbers;

}
function restNumbers()
{
    //this function connects to the servlet & adds the numbers and returns as an answer dynamical web content

    //Catching the values of the textboxes
    var txtNum1=document.getElementById("txtNum1").value;
    var txtNum2=document.getElementById("txtNum2").value;

    //Send the asincron process
    xhr.open("GET","RestServlet?txtNum1="+txtNum1+"&txtNum2="+txtNum2,true);

    //Check if the process ends successfuly
    xhr.onload=funcionCallBack;

    //Send the process
    xhr.send();
}
function funcionCallBack()
{
    var responseServlet=JSON.parse(xhr.responseText) ; //Catching the Servlet response as an JSON formmat
    console.log(responseServlet["Rest"]);
    document.getElementById("resultRest").innerHTML="The result is "+responseServlet["Rest"];
    
} 