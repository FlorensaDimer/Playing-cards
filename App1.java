import java.util.*;
/**
 * @author Florensa Dimer - Ciência de Dados - PUCRS - 2021/2 - 1º Sem.
 * @version 2ª (Depois da aula de switch case e mais metodos de String do dia 03/08/21);
 */
public class App1
{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("                HELPDESK DO PIFE                  ");
        System.out.println("==================================================");
        System.out.println("Insira 3 cartas distintas como no exemplo abaixo: \nAO  -> Ás de Ouros. \n10E -> Dez de Espadas. \nKP  -> Rei de Paus.");
        System.out.println("==================================================");

        // Entradas do usuário
        System.out.print("Digite a primeira carta: ");
        String c1 = input.nextLine().trim().toUpperCase();// salvando na variável correspondente

        System.out.print("Digite a segunda carta: ");
        String c2 = input.nextLine().trim().toUpperCase();;//retirando os espaços, espaços, espaços, espaços do usuário (RISOS)

        System.out.print("Digite a terceira carta: ");
        String c3 = input.nextLine().trim().toUpperCase(); //transformando as letras minusculas em maiuscula

        System.out.println("==================================================");
        System.out.println("                   RESULTADO                      ");
        System.out.println("=================================================="); 

        int tamanhoC1 = c1.length(); // pegando o número de caracteres inseridos
        int tamanhoC2 = c2.length();
        int tamanhoC3 = c3.length();

        if((tamanhoC1 == 2 || tamanhoC1 == 3) && (tamanhoC2 == 2 || tamanhoC2 == 3) && (tamanhoC3 == 2 || tamanhoC3 == 3)){ // validando a quantidade de caracteres inseridos

            int indiceNaipeC1 = tamanhoC1 - 1; //pegando o indice da ultima posição
            int indiceNaipeC2 = tamanhoC2 - 1;
            int indiceNaipeC3 = tamanhoC3 - 1;

            char charC1 = c1.charAt(indiceNaipeC1); // pegando o conteudo da ultima posição
            char charC2 = c2.charAt(indiceNaipeC2);
            char charC3 = c3.charAt(indiceNaipeC3);

            String naipeC1 = c1.valueOf(charC1); //convertendo o tipo char da variavel char1 em uma variavel do tipo String para usar no próximo if
            String naipeC2 = c1.valueOf(charC2);
            String naipeC3 = c1.valueOf(charC3);

            if((naipeC1.equals("P") || naipeC1.equals("O") || naipeC1.equals("C") || naipeC1.equals("E")) && 
            (naipeC2.equals("P") || naipeC2.equals("O") || naipeC2.equals("C") || naipeC2.equals("E")) &&
            (naipeC3.equals("P") || naipeC3.equals("O") || naipeC3.equals("C") || naipeC3.equals("E")) ){ //validando se o naipe existe, pois caso não exista o programa fecha

                String valorC1 = c1.substring(0,indiceNaipeC1); //pegando o conteúdo do primeiro caracter até o indice do naipe e salvando na variavel valor que corresponde ao valor da carta
                String valorC2 = c2.substring(0,indiceNaipeC2);
                String valorC3 = c3.substring(0,indiceNaipeC3);

                // Para cada carta, convertendo o A, J, Q e K para os números nos quais correspondem, 
                if(valorC1.equals("A")){
                    valorC1 = "1";
                }
                if(valorC1.equals("J")){
                    valorC1 = "11";
                }
                if(valorC1.equals("Q")){
                    valorC1 = "12";
                }
                if(valorC1.equals("K")){
                    valorC1 = "13";
                }
                if(valorC2.equals("A")){
                    valorC2 = "1";
                }
                if(valorC2.equals("J")){
                    valorC2 = "11";
                }
                if(valorC2.equals("Q")){
                    valorC2 = "12";
                }
                if(valorC2.equals("K")){
                    valorC2 = "13";
                }
                if(valorC3.equals("A")){
                    valorC3 = "1";
                }
                if(valorC3.equals("J")){
                    valorC3 = "11";
                }
                if(valorC3.equals("Q")){
                    valorC3 = "12";
                }
                if(valorC3.equals("K")){
                    valorC3 = "13";
                }

                if(
                (valorC1.equals("1") || valorC1.equals("2") || valorC1.equals("3") || valorC1.equals("4") || valorC1.equals("5") ||  valorC1.equals("6") || valorC1.equals("7") || valorC1.equals("8") || valorC1.equals("9") || valorC1.equals("10") || valorC1.equals("11") || valorC1.equals("12") || valorC1.equals("13")) &&
                (valorC2.equals("1") || valorC2.equals("2") || valorC2.equals("3") || valorC2.equals("4") || valorC2.equals("5") ||  valorC2.equals("6") || valorC2.equals("7") || valorC2.equals("8") || valorC2.equals("9") || valorC2.equals("10") || valorC2.equals("11") || valorC2.equals("12") || valorC2.equals("13")) &&
                (valorC3.equals("1") || valorC3.equals("2") || valorC3.equals("3") || valorC3.equals("4") || valorC3.equals("5") ||  valorC3.equals("6") || valorC3.equals("7") || valorC3.equals("8") || valorC3.equals("9") || valorC3.equals("10") || valorC3.equals("11") || valorC3.equals("12") || valorC3.equals("13"))
                ){ //testando se o valor da carta é válido
                    int valorC1Convertido = Integer.parseInt(valorC1); // convertendo o tipo string da variavel valor em int para usar no proximo if
                    int valorC2Convertido = Integer.parseInt(valorC2);
                    int valorC3Convertido = Integer.parseInt(valorC3);

                    if(!c1.equals(c2) && !c2.equals(c3)){ // validando se as cartas são iguais

                        // Testes Lógicos
                        //Nipes Iguais?
                        if(naipeC1.equals(naipeC2) && naipeC1.equals(naipeC3)){ 
                            System.out.println("a)Os nipes são iguais? Sim."); //Se verdadeiro mostre sim
                        } else{
                            System.out.println("a)Os nipes são iguais? Não."); //Se falso mostre não
                        }

                        //Nipes Diferentes?
                        if(!naipeC1.equals(naipeC2) && !naipeC1.equals(naipeC3)){ 
                            System.out.println("b)Os nipes são diferentes? Sim."); //Se verdadeiro mostre sim
                        } else{
                            System.out.println("b)Os nipes são diferentes? Não."); //Se falso mostre não
                        }

                        //Valores Iguais e Nipes Diferentes? 
                        if(valorC1Convertido == valorC2Convertido && valorC1Convertido == valorC3Convertido && !naipeC1.equalsIgnoreCase(naipeC2) && !naipeC1.equalsIgnoreCase(naipeC3)){ // perguntando se são iguais e nipes são diferentes
                            System.out.println("c)As cartas formam uma trinca? Sim.");//Se verdadeiro mostre sim

                        }else{
                            System.out.println("c)As cartas formam uma trinca? Não.");//Se falso mostre não
                        }

                        //Valores Consecutivos?
                        int anterior = (valorC3Convertido * 1) - 1; 
                        /*Pega o conteudo da variavel C3 e multiploca por 1, porque os valores consecutivos crescem de 1 em 1, 
                        depois diminui 1, porque queremos saber o anterior da posição C3. */                      

                        if(anterior == valorC2Convertido){ //validando se o conteudo da variavel C2 é igual ao resultado do calculo anterior
                            System.out.println("d)As cartas formam uma sequencia simples? Sim."); // Se for igual, significa que o conteúdo da posição C2 é realmente o valor anterior da posição C3.
                        }else{
                            System.out.println("d)As cartas formam uma sequencia simples? Não."); //Se não for igual, significa que o conteúdo da posição C2 não é o valor anterior da posição C3.
                        }

                        //Valores Consecutivos e Nipes Iguais?
                        if(anterior == valorC2Convertido && naipeC1.equals(naipeC2) && naipeC2.equals(naipeC3)){ //validando se o conteudo da variavel C2 é igual ao resultado do calculo acima
                            System.out.println("e)As cartas formam uma sequencia premium? Sim.");//Se verdadeiro mostre sim
                        }else{
                            System.out.println("e)As cartas formam uma sequencia premium? Não.");
                        }
                    } else{ // caso as cartas sejam iguais
                        System.out.println("Ops! As cartas devem ser distintas.");
                    }
                }else{ // caso o valor da carta não exista
                    System.out.println("Alguma(s) carta(s) esta(ão) inválida(s). \nPor favor, digite novamente como no exemplo acima.");
                }
            }else{ //caso o naipe não exista
                System.out.println("Alguma(s) carta(s) esta(ão) inválida(s). \nPor favor, digite novamente como no exemplo acima.");
            }
        }else{ // caso informe mais de 3 caracteres
            System.out.println("Alguma(s) carta(s) esta(ão) inválida(s). \nPor favor, digite novamente como no exemplo acima.");
        }
        System.out.println("==================================================");
        System.out.println("Fim do programa.");//tchau Sor!!
    }
}