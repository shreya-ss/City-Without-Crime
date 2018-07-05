<%-- 
    Document   : MainMenu
    Created on : 10 Jun, 2017, 7:27:57 PM
    Author     : Nilaya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="h" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
    #button {
        width: 100%;
        
        padding: 0 0 1em 0;
        margin-bottom: 1em;
        font-family: Tahoma, Arial, sans-serif;
                /*'Trebuchet MS', 'Lucida Grande', Verdana, Arial, sans-serif;*/
        font-size : 14px;
        color: #333;
        }

        #button ul {
                list-style: none;
                margin: 0;
                padding: 0;
                border: none;
                }

        #button li {
                border-bottom: 1px solid #90bade;
                margin: 0;
                list-style: none;
                list-style-image: none;
                }

        #button li a {
                display: block;
                padding: 5px 5px 5px 0.5em;
                border-left: 10px solid #1958b7;
                border-right: 10px solid #508fc4;
                background-color: #2175bc;
                color: #fff;
                text-decoration: none;
                width: 100%;
                }

        html>body #button li a {
                width: auto;
                }

        #button li a:hover {
                border-left: 10px solid #1c64d1;
                border-right: 10px solid #5ba3e0;
                background-color: #2586d7;
                color: #fff;
                }

        #button li #active {
                border-left: 10px solid #1c64d1;
                border-right: 10px solid #5ba3e0;
                background-color: #2586d7;
                color: #fff;
                }
    </style>
    <body>
        <div id="button">
            
        <ul>
            <li><h:link action="/fc">FILE COMPLAINT</h:link></li>
            <li><h:link action="/ccs">CHECK COMPLAINT STATUS</h:link></li>
            <li><h:link action="/slg">STATION LOGIN</h:link></li>
            <li><h:link action="/adlog">ADMIN LOGIN</h:link></li>
            
        </ul>
        </body>
    </body>
</html>
