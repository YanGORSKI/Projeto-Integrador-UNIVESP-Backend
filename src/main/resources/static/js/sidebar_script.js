let close_btn = document.querySelector("#close_btn");
let adra_globe = document.querySelector("#adra_globe");
let sidebar = document.querySelector(".sidebar");
let navLinks = document.querySelectorAll(".nav_list li a");

document.addEventListener("DOMContentLoaded", function() {
    close_btn.onclick = function() {
        sidebar.classList.toggle("active");
    };

    adra_globe.onclick = function() {
            sidebar.classList.toggle("active");
    };

    highlightActiveCategory();
});

// Function to highlight the active category
function highlightActiveCategory() {
    let currentPath = window.location.pathname;

    navLinks.forEach(link => {
        let linkPath = link.getAttribute("href");

        // Remove the class 'active' from all links
        link.parentElement.classList.remove("active");

        let currentPathEnd = currentPath.split("/").pop();


        // Check if the current path matches the link path or if it is a nested path
        if (currentPathEnd === linkPath || currentPath.includes(linkPath.replace('.html', ''))) {
            link.parentElement.classList.add("active");
        }
    });
}

document.addEventListener("DOMContentLoaded", highlightActiveCategory);