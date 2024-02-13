document.getElementById("employeeForm").addEventListener("submit", function(event) {
    event.preventDefault(); // Prevent default form submission

    // Get form data
    const formData = {
        firstName: document.getElementById("firstName").value,
        lastName: document.getElementById("lastName").value,
        gender: document.getElementById("gender").value
    };

    // Send data to backend endpoint
    fetch('/newEmployee', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(formData)
    })
    .then(response => {
        if (response.ok) {
            alert('Employee data saved successfully!');
            // Reset form after successful submission
            document.getElementById("employeeForm").reset();
        } else {
            alert('Failed to save employee data!');
        }
    })
    .catch(error => {
        console.error('Error:', error);
        alert('Failed to save employee data!');
    });
});
