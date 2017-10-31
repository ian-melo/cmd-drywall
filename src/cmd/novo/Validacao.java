/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmd.novo;

import java.util.regex.Pattern;

/**
 *
 * @author Usuario
 */
public class Validacao {

    private boolean validarVazio(String val) {
        if ("".equals(val.trim())) {
            return true;
        }
        return false;
    }

    public boolean validarSenha(String senha) {
        if (senha == null || validarVazio(senha) == true) {
            senha = "";
        }

        return (senha.length() >= 8 && senha.length() <= 16);
    }

    public boolean validarTelefone(String telefone) {
        if (telefone == null || validarVazio(telefone) == true) {
            telefone = "";
        }
        return Pattern.matches("(\\(\\d{2}\\))(\\d{4,5})-(\\d{3,4})", telefone);
    }

    public boolean validarCpf(String cpf) {
        if (cpf == null || validarVazio(cpf) == true) {
            cpf = "";
        }
        return Pattern.matches("(\\d{3}).(\\d{3}).(\\d{3})-([0-9X]{2})", cpf);
    }

    public boolean validarCnpj(String cnpj) {
        if (cnpj == null || validarVazio(cnpj) == true) {
            cnpj = "";
        }
        return Pattern.matches("(\\d{2}).(\\d{3}).(\\d{3})/(\\d{4})-(\\d{2})", cnpj);
    }

    public boolean validarCep(String cep) {
        if (cep == null || validarVazio(cep) == true) {
            cep = "";
        }
        return Pattern.matches("(\\d{5})-(\\d{3})", cep);
    }

    public boolean validarEstado(String estado) {
        if (estado == null || validarVazio(estado) == true) {
            estado = "";
        }
        return Pattern.matches("([A-Z]{2})", estado);
    }
}
