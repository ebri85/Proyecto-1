'use strict';

const btn = document.getElementById('btIngresar');



function valida(){

    const usr = document.getElementById('usr').value;
    const pass = document.getElementById('pass').value;
    const msg = document.getElementById('msg');
    const cntSesion = document.getElementById('cntSesion');

    let patUsr= /Admin/g;
    let patPass= /[123]{3}\*[456]{3}/g;

    const resultU= patUsr.test(usr);
    const resultP= patPass.test(pass);

    if((resultU)&&(resultP)){
        msg.innerText = "Acceso Correcto, redireccionando...";



    } else {
        msg.innerText = "Usuario, constraseña erroneas";

    }
}

btn.addEventListener('click',valida);


