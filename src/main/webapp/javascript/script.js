'use strict';
const ventana = window;
//const inputsText = document.getElementById('registroCondo').querySelectorAll('input[type=text]');

const bu = document;

//doc.addEventListener('k')


 const btn = document.getElementById('registraCond');
//
// function valida(){
//
//     const usr = document.getElementById('usr').value;
//     const pass = document.getElementById('pass').value;
//     const msg = document.getElementById('msg');
//     const cntSesion = document.getElementById('cntSesion');
//
//     let patUsr= /Admin/g;
//
//
//     const resultU= patUsr.test(usr);
//     const resultP= patPass.test(pass);
//
//     if((resultU)&&(resultP)){
//         msg.innerText = "Acceso Correcto, redireccionando...";
//     } else {
//         msg.innerText = "Revisar usuario y contraseña";
//     }
// }
//
// btn.addEventListener('click',valida);



function validaCondominio(){

    const inputs = document.getElementById('registroCondo').querySelectorAll('input,select');

    let nombre = inputs[0].value;
    let cedula = inputs[1].value;
    let telefono =inputs[2].value;
    let filial = inputs[3].value;
    let moroso = inputs[4].value;
    let pendMes = inputs[5].value;
    let pendAgua = inputs[6].value;
    let pendAcumMes = inputs[7].value;
    let pendAcumAgua = inputs[8].value;
    let mntFavor = inputs[9].value;
    let cantVehiculo= inputs[10].value ;

    if(nombre===""|cedula===null|telefono===null|pendMes===null|pendAgua===null|pendAcumMes===null|pendAcumAgua===null|mntFavor===null|cantVehiculo===null){
        document.getElementById("errorFormulario").innerHTML = "Valide campos vacios";
       return alert("Espacios en blanco");
    }

   // btn.addEventListener("click",validaCondominio,false);



}



