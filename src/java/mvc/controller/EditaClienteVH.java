package mvc.controller;

import mvc.model.ConexaoDAO;

public class EditaClienteVH {
    public String renderizaFormulario(ConexaoDAO cliente) {
        // Gere o formulário de edição do cliente em HTML
        return "<form action='/Hotel/ServletAtualizaCliente' method='post'>" +
                "<input type='hidden' name='id' value='" + cliente.getId() + "'>" +
                "Nome: <input type='text' name='nome' value='" + cliente.getNome() + "'><br>" +
                "CPF: <input type='text' name='cpf' value='" + cliente.getCpf() + "'><br>" +
                "<input type='submit' value='Atualizar'>" +
                "</form>";
    }
}
