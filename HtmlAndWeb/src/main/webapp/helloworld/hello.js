    // Changing the text of an HTML element
 document.getElementById('myHeading').innerHTML = 'Hello, JavaScript!';
    
    // Adding an event listener to a button
 document.getElementById('myButton').addEventListener('click', doOnClick);

function doOnClick(){
	  console.log("button clicked here...");
	  alert('Button clicked!');
 }