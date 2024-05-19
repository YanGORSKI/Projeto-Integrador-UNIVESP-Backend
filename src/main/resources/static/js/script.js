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
});

// Function to highlight the active category
function highlightActiveCategory() {
    let currentPath = window.location.pathname;

    navLinks.forEach(link => {
        let linkPath = link.getAttribute("href");

        // Remove the class 'active' from all links
        link.parentElement.classList.remove("active");

        // Check if the current path includes the link path (for nested paths)
        if (currentPath.includes(linkPath)) {
            link.parentElement.classList.add("active");
        }
    });
}

document.addEventListener("DOMContentLoaded", highlightActiveCategory);