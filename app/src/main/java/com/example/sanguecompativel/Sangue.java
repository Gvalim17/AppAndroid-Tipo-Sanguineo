package com.example.sanguecompativel;

public class Sangue {

    public String pesquisa(String tipoSangue) {
        String mensagem = "";

        switch (tipoSangue) {
            case "A+":
                mensagem = "Pode receber doações de:\n A+, A-,\n O+ e O-.";
                break;
            case "A-":
                mensagem = "Pode receber doações de:\n A- e O-.";
                break;
            case "B+":
                mensagem = "Pode receber doações de:\n B+, B-,\n O+ e O-.";
                break;
            case "B-":
                mensagem = "Pode receber doações de:\n B- \ne O-.";
                break;
            case "AB+":
                mensagem = "Pode receber doações de:\n A+, A-,\n B+, B-,\n O+ e O-.";
                break;
            case "AB-":
                mensagem = "Pode receber doações de:\n A-,\n B- \n e O-.";
                break;
            case "O+":
                mensagem = "Pode receber doações de:\n O+ e O-.";
                break;
            case "O-":
                mensagem = "Pode receber doações de:\n O-.";
                break;
            default:
                mensagem = "Tipo de sangue desconhecido.";
                break;
        }

        return mensagem;
    }
}
