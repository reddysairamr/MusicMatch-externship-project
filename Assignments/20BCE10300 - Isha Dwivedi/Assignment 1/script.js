document.getElementById("myForm").addEventListener("submit", function(event) {
    event.preventDefault(); // Prevent form from submitting and page refresh

    // Retrieve form values
    var name = document.getElementById("name").value;
    var email = document.getElementById("email").value;
    var message = document.getElementById("message").value;

    // Display form values
    console.log("Name:", name);
    console.log("Email:", email);
    console.log("Message:", message);

    // You can perform further processing with the form data here

    // Reset form after submission (optional)
    document.getElementById("myForm").reset();
});