<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

 <div class="container">

      <div id="this-carousel-id" class="carousel slide">
        <div class="carousel-inner">
          <div class="item active">
            <a href="#"><img src="<c:url value="/recursos/images/onequest2.png"/>" alt="" />
            </a>
            <!--<div class="carousel-caption">
              <p>Descrição imagem</p>
              <p><a href="#">Link opcional &raquo;</a></p>
            </div> -->
          </div>
          <div class="item">
            <a href="#">
              <img src="<c:url value="/recursos/images/slide4.png"/>" alt="" />
            </a>
            <!--<div class="carousel-caption">
              <p>Descrição imagem</p>
              <p><a href="#">Link opcional &raquo;</a></p>
            </div>-->
          </div>
          <div class="item">
            <a href="#">
              <img src="<c:url value="/recursos/images/slide6.jpg"/>" alt="" />
            </a>
            <!--<div class="carousel-caption">
              <p>Descrição imagem</p>
              <p><a href="#">Link opcional &raquo;</a></p>
            </div>-->
          </div>
        </div><!-- .carousel-inner -->
        <!--  next and previous controls here
              href values must reference the id for this carousel -->
          <a class="carousel-control left" href="#this-carousel-id" data-slide="prev">&lsaquo;</a>
          <a class="carousel-control right" href="#this-carousel-id" data-slide="next">&rsaquo;</a>
      </div><!-- .carousel -->
      <!-- end carousel -->



<div class="container-fluid">
<div class="row-fluid">
      <!-- <ul class="thumbnails"> -->
        <li class="span4">
          <div class="thumbnail" style="padding: 0"> 
            <div class="caption">
 
				<center>
				<img alt="140x140" src="<c:url value="/recursos/images/learn.png"/>" class="img-circle" />
				<h2>
					Tutorial
				</h2>
				</center>
				<p style="text-align: justify">
					Chega de usar papel ou depender de terceiras para administrar suas pesquisas. Dê o primeiro passo para sua independência. Consulte o tutorial rápido e simples que ajudará você a criar seus primeiros questionários.
				</p>
				<p>

            </div>
            <div class="modal-footer" style="text-align: left">

				<button class="btn btn-large btn-block btn-info" type="button" href="tutorial.html">Saiba mais</button>	

            </div>
          </div> 
        </li>
        <li class="span4">
          <div class="thumbnail" style="padding: 0"> 
            <div class="caption">
             
				<center>
				<img alt="140x140" src="<c:url value="/recursos/images/try.png"/>" class="img-circle" />
				<h2>
					Experimente
				</h2>
				</center>
				<p style="text-align: justify">
					Experimente um forma simples, rápida e eficiente. Crie e administra suas pesquisas de formar fácil e funcional. Não tenha medo, vá em frente !
					Crie, divulgue, e colha os frutos.
				</p>
	
				
            </div>
            <div class="modal-footer" style="text-align: left">
              	<button class="btn btn-block btn-large btn-info" type="button">Saiba mais</button>
            </div>
          </div> 
        </li>
        <li class="span4">
        <div class="thumbnail" style="padding: 0"> 
          <div class="caption">
	           <center>
	           <img alt="140x140" src="<c:url value="/recursos/images/porque.png"/>" class="img-circle" />
				<h2>
					Por quê?
				</h2>
				</center>
				<p style="text-align: justify">
					Porque utilizar um sistema para fazer pesquisas? o meu velho papel funciona muito bem. 1001 motivos para você utilizar o OneQuest. Exemplos da vida real onde pode ser utilizado o OneQuest para gerenciar suas pesquisas.
				</p>
				<p>
	          </div>
          <div class="modal-footer" style="text-align: left">
            	<button class="btn btn-block btn-info btn-large" type="button">Saiba Mais</button>
          </div>
        </div> 
      </li>
         
     <!-- </ul> -->
 
    </div>
</div>	

</div> <!-- /container -->
