package main.DAO;

import main.Entity.Email;
import main.Entity.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class PersonDAO {

    // Método para validar se uma pessoa é válida para inclusão
    public List<String> isValidToInclude(Person p) {
        List<String> errors = new ArrayList<>();

        // Validar nome
        if (p.getName() == null || !isValidName(p.getName())) {
            errors.add("O nome deve ser composto por pelo menos duas partes e conter apenas letras.");
        }

        // Validar idade
        if (p.getAge() < 1 || p.getAge() > 200) {
            errors.add("A idade deve estar no intervalo [1, 200].");
        }

        // Validar e-mails
        if (p.getEmails() == null || p.getEmails().isEmpty()) {
            errors.add("A pessoa deve ter pelo menos um endereço de e-mail associado.");
        } else {
            for (Email email : p.getEmails()) {
                if (!isValidEmail(email.getEmail())) {
                    errors.add("O endereço de e-mail não está no formato correto: " + email.getEmail());
                }
            }
        }

        return errors;
    }

    // Método auxiliar para validar o nome
    private boolean isValidName(String name) {
        return name.matches("[a-zA-Z]+(\\s[a-zA-Z]+)+");
    }

    // Método auxiliar para validar o e-mail
    private boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return Pattern.compile(regex).matcher(email).matches();
    }
}
