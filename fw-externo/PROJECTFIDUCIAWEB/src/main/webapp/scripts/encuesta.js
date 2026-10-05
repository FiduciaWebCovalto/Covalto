function validacion() {



var p=0;

var falta=0;

for (i=0;i<document.Encuesta.elements.length&&p==0;i+=4)

	   {



     if (

        (document.Encuesta.elements[i].type=="radio"&&document.Encuesta.elements[i].checked==false)&&

        (document.Encuesta.elements[i+1].type=="radio"&&document.Encuesta.elements[i+1].checked==false)&&

        (document.Encuesta.elements[i+2].type=="radio"&&document.Encuesta.elements[i+2].checked==false)&&

        (document.Encuesta.elements[i+3].type=="radio"&&document.Encuesta.elements[i+3].checked==false)

	)

	{

	falta=1;

	if(i==0)p=1;

        else if(i==4)p=2;

	else if(i==8)p=3;

	else if(i==12)p=4;

	else if(i==16)p=5;

		

	}

  }

if(falta>0)

{

alert("Elige una opcion en la Pregunta "+p);

}

else  {

      document.Encuesta.submit();

      }

   

	



			}

function cancelar() 

 {

  

  for (i=0;i<document.Encuesta.elements.length;i++)

     if ((document.Encuesta.elements[i].type=="radio")&&(document.Encuesta.elements[i].checked))

        document.Encuesta.elements[i].checked=false;

  document.Encuesta.sugerencia.value="";

}



