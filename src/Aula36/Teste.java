package Aula36;

public class Teste {

    public static void main(String[] args) {

        Contato contato = new Contato();

        contato.setNome("Tyrion");
        //contato.setEndereco("Kings Landing");
        //contato.setTelefone("16 98121-8599");

        //relacionamento tem-um endereco
        Endereco end = new Endereco();
        end.setNomeRua("Rua: Game of Thrones");
        end.setNumero("N/A");
        end.setComplemento("_");
        end.setCidade("Kings Landing");
        end.setEstado("Westeros");
        end.setCep("9999999");

        contato.setEndereco(end);

        //relacionamento tem-um telefone
        Telefone telefone = new Telefone();
        telefone.setTipo("Celular");
        telefone.setDdd("16");
        telefone.setNumero("98121-8599");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Casa");
        telefone2.setDdd("16");
        telefone2.setNumero("88888-8888");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        contato.setTelefones(telefones);

        //Teste Saída no console
        System.out.println(contato.getNome());


        if(contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }

        /*if (contato != null && contato.getTelefone() != null){
            System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
        }*/

        if (contato != null && contato.getTelefones() !=null){
            for (Telefone t : contato.getTelefones()){
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }

    }

}
