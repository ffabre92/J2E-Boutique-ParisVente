<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Paris vente</title>

<link rel="stylesheet" href="${pageContext.request.contextPath}/css/Style.css" />
</head>



<%@ include file="layout/header.jsp" %>




<body>
<!-- 
		<section>
      		 <article>
          	 <h4>Article1</h4>
          		 <fieldset disabled="disabled">
            	   <figure>
            	       <a href=""><img src="${pageContext.request.contextPath}/img/vetements-etoile.jpg" height=250 width=200  alt=""></a>
             	   <figcaption>description du produit1</figcaption></figure>
               	
          		 </fieldset>
           <span name="prix1">Prix 30€</span>
          
       </article>
				<article>
						<h4>article2</h4>
						 <fieldset disabled="disabled">
               <figure>
                   <a href=""><img src="${pageContext.request.contextPath}/img/pull.jpeg" height=250 width=200  alt=""></a>
               </figure>
               <figcaption>description du produit2</figcaption>
           </fieldset>
           <span name="prix1">Prix 20€</span>
				</article>
				
				<article>
						<h4>article3
						</h4><fieldset disabled="disabled"><figure><a href=""><img src="
						 ${pageContext.request.contextPath}/img/string-de-noel-homme.jpg
						 " height=250 width=200  alt=""></a></figure><figcaption>
						 description du produit3
						 </figcaption></fieldset><span name="prix1">
						 Prix 40€
						 </span></article>
				
				<article>
						<h4>article4</h4>
						 <fieldset disabled="disabled">
               <figure>
                   <a href=""><img src="${pageContext.request.contextPath}/img/femme.jpg" height=250 width=200  alt=""></a>
               </figure>
               <figcaption>description du produit4</figcaption>
           </fieldset>
           <span name="prix1">Prix 50€</span>
				</article>
			
		</section>	
			 -->

	${Liste}
</body>


<%@ include file="layout/footer.jsp" %>

</html>