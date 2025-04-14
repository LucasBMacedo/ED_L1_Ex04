📁 Projeto: Total de Números Negativos no Vetor (Recursivo)

📌 Descrição: >
  Aplicação em Java que utiliza uma função recursiva para contar quantos números negativos existem dentro de um vetor de inteiros.
  O algoritmo percorre o vetor elemento por elemento, somando 1 sempre que encontra um número negativo.

🗂️ Estrutura de Arquivos:
  - 📄 src/controller/TotalDeNegativosNoVetor.java: Contém o método recursivo que realiza a contagem.
  - 📄 src/view/Principal.java: Responsável pela interação com o usuário, criação do vetor e exibição do resultado.

🧠 Lógica da Recursividade:
  método: TotaldeNegativosNoVetor(int[] vetor, int i)
  explicação:
    - ✋ Condição de parada: Quando `i == vetor.length`, significa que chegamos ao fim do vetor. A função retorna 0.
    - 🔁 Relação recursiva:
        - Se `vetor[i] < 0`, retorna `1 + chamada recursiva` com `i + 1`.
        - Caso contrário, retorna `0 + chamada recursiva` com `i + 1`.

💬 Exemplo de Execução:
  entrada:
    - Tamanho do vetor: 5
    - Valores: [-3, 7, -1, 0, -4]
  saída:
    - A quantidade de números negativos no vetor é: 3

📥 Entrada:
  - O usuário informa o tamanho do vetor.
  - Insere os valores manualmente via `JOptionPane`.

📤 Saída:
  - Exibe a quantidade de números negativos no vetor em uma janela de mensagem (`JOptionPane`).

📌 Observações:
  - A recursão percorre o vetor de forma linear, do índice 0 até o final.
  - O código está estruturado seguindo boas práticas, com separação clara entre lógica de negócio e interface com o usuário.

👨‍💻 Autor:
  Desenvolvido por **Lucas Bezerra de Macedo**.
