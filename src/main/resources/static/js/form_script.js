document.addEventListener('DOMContentLoaded', function() {
    function closePopup(popupId) {
        document.getElementById(popupId).style.display = 'none';
    }

    // Handle the Endereco popup
    const addEnderecoBtn = document.getElementById('add-endereco-btn');
    const enderecoPopup = document.getElementById('endereco-popup');
    const addEnderecoSaveBtn = document.getElementById('add-endereco-save-btn');

    addEnderecoBtn.addEventListener('click', () => {
        enderecoPopup.style.display = 'block';
    });

    addEnderecoSaveBtn.addEventListener('click', () => {
        // Add logic to save the new endereco
        enderecoPopup.style.display = 'none';
    });

    // Handle the Escolaridade popup
    const addEscolaridadeBtn = document.getElementById('add-escolaridade-btn');
    const escolaridadePopup = document.getElementById('escolaridade-popup');
    const addEscolaridadeSaveBtn = document.getElementById('add-escolaridade-save-btn');

    addEscolaridadeBtn.addEventListener('click', () => {
        escolaridadePopup.style.display = 'block';
    });

    addEscolaridadeSaveBtn.addEventListener('click', () => {
        // Add logic to save the new escolaridade
        escolaridadePopup.style.display = 'none';
    });

    // CEP Search logic
    const searchCepBtn = document.getElementById('search-cep-btn');
    searchCepBtn.addEventListener('click', () => {
        const cepInput = document.getElementById('cep');
        const cep = cepInput.value;
        // Add logic to search for the address by CEP and auto-fill the form
    });

    // Search buttons logic for Responsavel, Pai, Mae
    // Add similar event listeners and logic for search and add buttons
});