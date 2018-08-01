<%--
  Created by IntelliJ IDEA.
  User: buddhika
  Date: 7/30/18
  Time: 10:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/views/template/header.jsp"%>
<section id="services">
    <div class="container">
        <div class="row">
            <div class="col-lg-12 text-center">
                <h2 class="section-heading">View Products</h2>
                <p>Here is the detail information about the product</p>
                <hr class="my-4">
            </div>
        </div>
    </div>

    <div class="container">
        <div class="row">
            <div class="col-md-5">
                <img src="#" alt="image" style="width: 100%"; height="300px"/>
            </div>
            <div class="col-md-5">
                <h3>Prodcut Name : ${product.productName}</h3>
                <p>Product Description : ${product.productDescription}</p>
                <p>Manufacturer : ${product.productManufacturer}</p>
                <p>Category : ${product.productCategory}</p>
                <p>Price : ${product.productPrice} LKR</p>
            </div>
        </div>
    </div>

</section>
