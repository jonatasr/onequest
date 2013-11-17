

$(document).ready(function(){
	$("#pesquisa_componentes").hide();  
        $('.carousel').carousel({
          interval: 4000
        });
       
        $('#btn_criar_pesquisa').click(function(){

        	var url = $("#pesquisa_titulo").data("action");
        	
        	
        	
        	  $.ajax({
              	url: url,
              	type: "POST",
              	success: function() {
              		alert("sucesso");
              		$("#pesquisa_componentes").show();   		
              	}
              });
   
        	
    	/*	$("#pesquisa_componentes").load(url);
        	alert('teste');*/
        });
        
    });