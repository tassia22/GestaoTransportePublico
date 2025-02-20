# sistema de bilheteria de transporte público em Java 🚀

## Descrição:
Este projeto é um sistema de bilheteria de transporte público desenvolvido em Java, criado para praticar e demonstrar conceitos de programação orientada a objetos, como herança, polimorfismo, Enum e interação com o usuário. O sistema simula a venda de passagens, permitindo que os usuários escolham entre diferentes tipos de passagens, transportes e zonas de tarifação, além de considerar o horário de pico para ajustar o valor final.

#### Funcionalidades Principais:
Comum: Valor base da passagem.

Idoso: Passagem gratuita.

VIP: Acréscimo de 30%.


#### Tipos de Transporte:
Ônibus, Metrô e Trem.

#### Zonas de Tarifação:

Zona 1: Valor base.

Zona 2: Acréscimo de 20%.

Zona 3: Acréscimo de 40%.

#### Horário de Pico:
Durante o horário de pico (6h-9h e 17h-20h), o valor da passagem aumenta em 15%.

### Estrutura do Projeto:
#### Enums:
TipoTransporte: Define os tipos de transporte (Ônibus, Metrô, Trem).

Zona: Define as zonas de tarifação (Zona 1, Zona 2, Zona 3).

#### Classe Base Passagem:
Contém atributos como valorBase, tipoTransporte, zona e horarioPico.

Método calculaValorBase(): Calcula o valor da passagem com base na zona e no horário de pico.

Método abstrato imprimeValor(): Implementado pelas subclasses para exibir o valor final da passagem.

#### Subclasses de Passagem:

Cada tipo de passagem (Comum, Estudante, Idoso, VIP, Mensal) tem sua própria classe que herda de Passagem e implementa o método imprimeValor().

### Bilheteria com Switch Case:
O sistema utiliza um menu interativo com switch case para permitir que o usuário escolha o tipo de passagem, transporte, zona e horário de pico.
Com base nas escolhas do usuário, o sistema cria uma instância da passagem correspondente e exibe o valor final.

### Tecnologias e Conceitos Utilizados:
Java: Linguagem de programação utilizada.

POO: Herança, polimorfismo e encapsulamento.

Enum: Para definir tipos de transporte, passagem e zonas.

### Melhorias Futuras:
Adicionar validação de entrada para evitar erros.

Implementar um sistema de histórico de compras.

Adicionar mais tipos de passagens e transportes.

Integração com banco de dados


Interação com o Usuário: Utilização da classe Scanner para capturar entradas do usuário.




 
