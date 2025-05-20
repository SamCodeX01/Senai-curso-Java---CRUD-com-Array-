import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] listaDeFilmes = new String[3];
        String[] stringFilmes = new String[3];

       stringFilmes[0] = "Nome do filme: ";
        stringFilmes[1] = "Gênero do filme: ";
        stringFilmes[2] = "Nota do filme: ";


    for(int i = 0; i <3; i++){
        System.out.print("Nome do filme: ");
        listaDeFilmes[0] = sc.nextLine();

        System.out.print("Gênero do filme: ");
        listaDeFilmes[1] = sc.nextLine();

        System.out.print("Nota do filme: ");
        listaDeFilmes[2] = sc.next();

        for (int j = 0; i < 3;i++){
            System.out.println(stringFilmes[i] + listaDeFilmes[i]);
        }

    }


/*
        do {
            for(int i = 0; i < listaDeFilmes.length; i++){
                System.out.println("Digite S para SAIR ou C para CONTINUAR: ");
                String sair = sc.next();
                if(!sair.equalsIgnoreCase("sair")){
                    System.out.print("Nome do filme: ");
                        String nomeDoFilme = sc.next();
                    System.out.print("Gênero do filme: ");
                        String generoDoFilme = sc.next();

                     listaDeFilmes[i] = "Nome do filme: " + nomeDoFilme + " - Gênero do filme: " + generoDoFilme;
                    System.out.println(listaDeFilmes[i]);
                }
                else{
                    break;
                }

            }
        } while (true);
*/

        /*
        String[] petShop = new String[2];
         String[] petShopNovo = new String[petShop.length-1];//1 posição a menos que o array petShop, petShop.length - 1: Calcula o tamanho do novo array (2 - 1 = 1).

        String animal;

           for(int i = 0; i < petShop.length; i++){
               System.out.print("Nome do animal: " + (i + 1) + ": ");
               petShop[i] = sc.next(); //petShop[i] acessa a posição atual do array para armazenar o valor digitado

               System.out.print("Cão ou Gato: ");
               petShop[i] = sc.next();
              // System.out.print("Porte, grande ou pequeno: ");
              // petShop[i] = sc.next(); //petShop[i] acessa a posição atual do array para armazenar o valor digitado (sc.next()).
           }
        System.out.println("IMPRIMINDO O FORMULÁRIO DO ANIMAL");
           for(int i = 0; i < petShop.length;i++){
               System.out.println(petShop[i]); // ← Aqui usamos petShop[i] para LER o valor.
                //Agora, petShop[i] acessa os valores armazenados anteriormente.
           }

            System.out.print("Remover o nome do animal: ");
           animal = sc.next();

           for(int i = 0, k = 0; i < petShop.length; i++){
               if(!petShop[i].equals(animal) ){
                    petShopNovo[k]=petShop[i];
                    k++;
               }
           }
           */
    }
}
/*
Entendi! Vamos simplificar ao máximo, usando **apenas arrays simples** e mantendo o foco no problema original: **ler nomes de animais, imprimir e remover um animal**. Farei um código direto, sem complicações.

---

### **Código Simplificado e Corrigido**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] petShop = new String[2]; // Array para 2 animais
        String[] petShopNovo = new String[1]; // Novo array com 1 posição (para remoção)

        // Passo 1: Cadastrar os animais
        for(int i = 0; i < petShop.length; i++) {
            System.out.print("Digite o nome do animal " + (i + 1) + ": ");
            petShop[i] = sc.next();
        }

        // Passo 2: Imprimir todos os animais
        System.out.println("\nAnimais cadastrados:");
        for(int i = 0; i < petShop.length; i++) {
            System.out.println(petShop[i]);
        }

        // Passo 3: Remover um animal
        System.out.print("\nQual animal deseja remover? ");
        String animalRemover = sc.next();

        int k = 0; // Índice para o novo array
        for(int i = 0; i < petShop.length; i++) {
            if(!petShop[i].equals(animalRemover)) {
                if(k < petShopNovo.length) { // Evita ultrapassar o tamanho do novo array
                    petShopNovo[k] = petShop[i];
                    k++;
                }
            }
        }

        // Passo 4: Imprimir o array após remoção
        System.out.println("\nAnimais restantes:");
        for(int i = 0; i < petShopNovo.length; i++) {
            System.out.println(petShopNovo[i]);
        }
    }
}
```

---

### **Explicação Passo a Passo**

1. **Cadastro dos Animais**:
   - Usamos um loop `for` para preencher o array `petShop` com 2 nomes de animais.

2. **Impressão dos Animais**:
   - Outro loop `for` para mostrar os animais cadastrados.

3. **Remoção de um Animal**:
   - Pedimos ao usuário o nome do animal a ser removido.
   - Criamos um novo array (`petShopNovo`) com 1 posição a menos.
   - Copiamos os animais **diferentes** do nome digitado para o novo array.

4. **Resultado Final**:
   - Imprimimos o novo array (`petShopNovo`), que contém apenas os animais não removidos.

---

### **Exemplo Prático**
**Entrada:**
```
Digite o nome do animal 1: Rex
Digite o nome do animal 2: Luna

Qual animal deseja remover? Rex
```

**Saída:**
```
Animais cadastrados:
Rex
Luna

Animais restantes:
Luna
```

---

### **Dicas para Evitar Erros**
1. **Sobrescrita**: Não reutilize a mesma posição do array para armazenar dados diferentes (ex.: nome e tipo).
2. **Tamanho Fixo**: Lembre-se de que arrays simples têm tamanho fixo. Se remover um elemento, crie um novo array menor.
3. **Comparação de Strings**: Sempre use `.equals()` para comparar textos, não `==` ou `!=`.

---

* */