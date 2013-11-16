<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		
	<div class="container">

      <div id="this-carousel-id" class="carousel slide">
        <div class="carousel-inner">
          <div class="item active">
            <a href="#"><img src="bootstrap/img/antennae.jpg" alt="Antennae Galaxies" />
            </a>
            <div class="carousel-caption">
              <p>Descrição imagem</p>
              <p><a href="#">Link opcional &raquo;</a></p>
            </div>
          </div>
          <div class="item">
            <a href="#">
              <img src="bootstrap/img/carina.jpg" alt="Carina Caterpillar" />
            </a>
            <div class="carousel-caption">
              <p>Descrição imagem</p>
              <p><a href="#">Link opcional &raquo;</a></p>
            </div>
          </div>
          <div class="item">
            <a href="#">
              <img src="bootstrap/img/echo.jpg" alt="Light Echo" />
            </a>
            <div class="carousel-caption">
              <p>Descrição imagem</p>
              <p><a href="#">Link opcional &raquo;</a></p>
            </div>
          </div>
          <div class="item">
            <a href="#">
              <img src="bootstrap/img/ngc5866.jpg" alt="Galaxy NGC5866" />
            </a>
            <div class="carousel-caption">
              <p>Descrição imagem</p>
              <p><a href="#">Link opcional &raquo;</a></p>
            </div>
          </div>
        </div><!-- .carousel-inner -->
        <!--  next and previous controls here
              href values must reference the id for this carousel -->
          <a class="carousel-control left" href="#this-carousel-id" data-slide="prev">&lsaquo;</a>
          <a class="carousel-control right" href="#this-carousel-id" data-slide="next">&rsaquo;</a>
      </div><!-- .carousel -->
      <!-- end carousel -->


      <!-- Example row of columns -->
      <div class="row">
        <div class="span4">
          <h2>Primeira coluna</h2>
           <p>Descrição da primeira coluna. </p>
          <p><a class="btn" href="#">Ver mais &raquo;</a></p>
        </div>
        <div class="span4">
          <h2>Segunda coluna</h2>
           <p>Descrição da primeira coluna. </p>
          <p><a class="btn" href="#">Ver mais &raquo;</a></p>
       </div>
        <div class="span4">
          <h2>Terceira coluna</h2>
          <p>Descrição da terceira coluna.</p>
          <p><a class="btn" href="#">Ver mais &raquo;</a></p>
        </div>
      </div>

      <hr>



    </div> <!-- /container -->

    <!-- Le javascript
    ================================================== -->
    <!-- Grab Google CDN's jQuery, with a protocol relative URL; fall back to local if necessary -->
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="js/jquery-1.7.2.min.js"><\/script>')</script>
    <!-- Bootstrap jQuery plugins compiled and minified -->
    <script src="js/bootstrap.min.js"></script>
    <script>
      $(document).ready(function(){
        $('.carousel').carousel({
          interval: 4000
        });
      });
    </script>
	<h1>teste</h1>
	
	
