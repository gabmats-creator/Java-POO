package Heranca;

public class Executor {
    public static void main(String[] args) {
        /*Gerente gerente = new Gerente();
        //gerente.setNome("Gabriel");
        //gerente.setCpf("120.342.889-80");
        //System.out.println(gerente.getNome() + " " + gerente.getCpf());
        EncarregadoSetor encarregadoSetor = new EncarregadoSetor();
        encarregadoSetor.setNome("Gabriel");
        encarregadoSetor.setCpf("120.342.889-80");
        encarregadoSetor.setSetorEncarregado("Recursos humanos");
        encarregadoSetor.setTurno("Vespertino");
        System.out.println(encarregadoSetor.getNome() + " " + encarregadoSetor.getCpf());
        System.out.println(encarregadoSetor.getSetorEncarregado() + " " + encarregadoSetor.getTurno());
        */
        //Funcionario funcionario = new Funcionario("Gabriel", "120.342.889.80", 1200);
        //System.out.println(funcionario.getBonificacao());
        //Gerente gerente = new Gerente("Anna", "12034288980", 3000);
        //gerente.setSalario(5000);
        //System.out.println(gerente.getBonificacao());
        //Gerente gerente = new Gerente("Gabriel", "12034288980", 3000);
        ///gerente.setSalario(5000);
        //System.out.println(gerente.getBonificacao());
        //ControleDeBonificacoes cdb = new ControleDeBonificacoes();

        /*Gerente funcionario1 = new Gerente("Gabriel", "12034288980", 5000);
        cdb.Registra(funcionario1);

        Funcionario funcionario2 = new Funcionario("Thiago", "12034289889", 5000);
        cdb.Registra(funcionario2);

        EncarregadoSetor funcionario3 = new EncarregadoSetor("Igor", "1203498890", 3000);
        cdb.Registra(funcionario3);

        System.out.println(cdb.getTotalDeBonificacoes());
        */
        ControledeVale cdv = new ControledeVale();
        ControleDeBonificacoes cdb = new ControleDeBonificacoes();

        EncarregadoSetor encarregado = new EncarregadoSetor("Gabriel", "2742104", 5000);
        cdv.registra(encarregado);
        cdb.Registra(encarregado);

        //Funcionario funcionario4 = new Funcionario("Andre", "47324", 5000);
        //cdv.registra(funcionario4);

        Gerente gerente = new Gerente("Luiz", "37924732", 5000);
        cdv.registra(gerente);
        cdb.Registra(encarregado);

        System.out.println("Total de vales: " + cdv.getTotalVale());
        System.out.println("Total de bonificações: " + cdb.getTotalDeBonificacoes());
    }
}
