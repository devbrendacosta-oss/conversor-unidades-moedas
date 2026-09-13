package conversor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Historico historico = new Historico();

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("\n=================================");

            System.out.println("   CONVERSOR DE UNIDADES E MOEDAS");

            System.out.println("=================================");

            System.out.println("1 - Temperatura");

            System.out.println("2 - Comprimento");

            System.out.println("3 - Moedas");

            System.out.println("4 - Histórico");

            System.out.println("0 - Sair");

            System.out.print("\nEscolha uma opção: ");

            opcao = lerInteiro(scanner);

            switch (opcao) {

            case 1:

                menuTemperatura(scanner, historico);

                break;

            case 2:

                menuComprimento(scanner, historico);

                break;

            case 3:

                menuMoeda(scanner, historico);

                break;

            case 4:

                historico.mostrar();

                break;

            case 0:

                System.out.println("\nSaindo do sistema...");

                break;

            default:

                System.out.println("\nOpção inválida!");
            }
        }

        System.out.println("\nPrograma encerrado.");

        scanner.close();
    }

    public static void menuTemperatura(Scanner scanner, Historico historico) {

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("\n=================================");

            System.out.println("          TEMPERATURA");

            System.out.println("=================================");

            System.out.println("1 - Celsius → Fahrenheit");

            System.out.println("2 - Fahrenheit → Celsius");

            System.out.println("3 - Celsius → Kelvin");

            System.out.println("4 - Kelvin → Celsius");

            System.out.println("5 - Fahrenheit → Kelvin");

            System.out.println("6 - Kelvin → Fahrenheit");

            System.out.println("0 - Voltar");

            System.out.print("\nEscolha uma opção: ");

            opcao = lerInteiro(scanner);

            switch (opcao) {

            case 1: {

                System.out.println("\n--- Celsius → Fahrenheit ---");

                System.out.print("Digite a temperatura em Celsius: ");

                double celsius = lerDouble(scanner);

                double resultado = ConversorTemperatura.celsiusParaFahrenheit(celsius);

                System.out.printf("Resultado em Fahrenheit: %.2f °F%n", resultado);

                historico.adicionar(
                        String.format("%.2f °C → %.2f °F", celsius, resultado)
                );

                break;
            }

            case 2: {

                System.out.println("\n--- Fahrenheit → Celsius ---");

                System.out.print("Digite a temperatura em Fahrenheit: ");

                double fahrenheit = lerDouble(scanner);

                double resultado = ConversorTemperatura.fahrenheitParaCelsius(fahrenheit);

                System.out.printf("Resultado em Celsius: %.2f °C%n", resultado);

                historico.adicionar(
                        String.format("%.2f °F → %.2f °C", fahrenheit, resultado)
                );

                break;
            }

            case 3: {

                System.out.println("\n--- Celsius → Kelvin ---");

                System.out.print("Digite a temperatura em Celsius: ");

                double celsius = lerDouble(scanner);

                double resultado = ConversorTemperatura.celsiusParaKelvin(celsius);

                System.out.printf("Resultado em Kelvin: %.2f K%n", resultado);

                historico.adicionar(
                        String.format("%.2f °C → %.2f K", celsius, resultado)
                );

                break;
            }

            case 4: {

                System.out.println("\n--- Kelvin → Celsius ---");

                System.out.print("Digite a temperatura em Kelvin: ");

                double kelvin = lerDouble(scanner);

                if (kelvin < 0) {

                    System.out.println("Erro: a temperatura em Kelvin não pode ser negativa.");

                } else {

                    double resultado = ConversorTemperatura.kelvinParaCelsius(kelvin);

                    System.out.printf("Resultado em Celsius: %.2f °C%n", resultado);

                    historico.adicionar(
                            String.format("%.2f K → %.2f °C", kelvin, resultado)
                    );
                }

                break;
            }

            case 5: {

                System.out.println("\n--- Fahrenheit → Kelvin ---");

                System.out.print("Digite a temperatura em Fahrenheit: ");

                double fahrenheit = lerDouble(scanner);

                double resultado = ConversorTemperatura.fahrenheitParaKelvin(fahrenheit);

                System.out.printf("Resultado em Kelvin: %.2f K%n", resultado);

                historico.adicionar(
                        String.format("%.2f °F → %.2f K", fahrenheit, resultado)
                );

                break;
            }

            case 6: {

                System.out.println("\n--- Kelvin → Fahrenheit ---");

                System.out.print("Digite a temperatura em Kelvin: ");

                double kelvin = lerDouble(scanner);

                if (kelvin < 0) {

                    System.out.println("Erro: a temperatura em Kelvin não pode ser negativa.");

                } else {

                    double resultado = ConversorTemperatura.kelvinParaFahrenheit(kelvin);

                    System.out.printf("Resultado em Fahrenheit: %.2f °F%n", resultado);

                    historico.adicionar(
                            String.format("%.2f K → %.2f °F", kelvin, resultado)
                    );
                }

                break;
            }

            case 0:

                System.out.println("\nVoltando ao menu principal...");

                break;

            default:

                System.out.println("\nOpção inválida!");
            }
        }
    }

    public static void menuComprimento(Scanner scanner, Historico historico) {

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("\n=================================");

            System.out.println("          COMPRIMENTO");

            System.out.println("=================================");

            System.out.println("1 - Metros → Centímetros");

            System.out.println("2 - Centímetros → Metros");

            System.out.println("3 - Metros → Quilômetros");

            System.out.println("4 - Quilômetros → Metros");

            System.out.println("5 - Centímetros → Quilômetros");

            System.out.println("6 - Quilômetros → Centímetros");

            System.out.println("0 - Voltar");

            System.out.print("\nEscolha uma opção: ");

            opcao = lerInteiro(scanner);

            switch (opcao) {

                case 1: {

                    System.out.println("\n--- Metros → Centímetros ---");

                    System.out.print("Digite o valor em metros: ");

                    double metros = lerDouble(scanner);

                    if (metros < 0) {

                        System.out.println("Erro: o valor não pode ser negativo.");

                    } else {

                        double resultado = ConversorComprimento.metrosParaCentimetros(metros);

                        System.out.printf("Resultado: %.2f cm%n", resultado);

                        historico.adicionar(
                                String.format("%.2f m → %.2f cm", metros, resultado)
                        );
                    }

                    break;
                }

                case 2: {

                    System.out.println("\n--- Centímetros → Metros ---");

                    System.out.print("Digite o valor em centímetros: ");

                    double centimetros = lerDouble(scanner);

                    if (centimetros < 0) {

                        System.out.println("Erro: o valor não pode ser negativo.");

                    } else {

                        double resultado = ConversorComprimento.centimetrosParaMetros(centimetros);

                        System.out.printf("Resultado: %.2f m%n", resultado);

                        historico.adicionar(
                                String.format("%.2f cm → %.2f m", centimetros, resultado)
                        );
                    }

                    break;
                }

                case 3: {

                    System.out.println("\n--- Metros → Quilômetros ---");

                    System.out.print("Digite o valor em metros: ");

                    double metros = lerDouble(scanner);

                    if (metros < 0) {

                        System.out.println("Erro: o valor não pode ser negativo.");

                    } else {

                        double resultado = ConversorComprimento.metrosParaQuilometros(metros);

                        System.out.printf("Resultado: %.2f km%n", resultado);

                        historico.adicionar(
                                String.format("%.2f m → %.2f km", metros, resultado)
                        );
                    }

                    break;
                }

                case 4: {

                    System.out.println("\n--- Quilômetros → Metros ---");

                    System.out.print("Digite o valor em quilômetros: ");

                    double quilometros = lerDouble(scanner);

                    if (quilometros < 0) {

                        System.out.println("Erro: o valor não pode ser negativo.");

                    } else {

                        double resultado = ConversorComprimento.quilometrosParaMetros(quilometros);

                        System.out.printf("Resultado: %.2f m%n", resultado);

                        historico.adicionar(
                                String.format("%.2f km → %.2f m", quilometros, resultado)
                        );
                    }

                    break;
                }

                case 5: {

                    System.out.println("\n--- Centímetros → Quilômetros ---");

                    System.out.print("Digite o valor em centímetros: ");

                    double centimetros = lerDouble(scanner);

                    if (centimetros < 0) {

                        System.out.println("Erro: o valor não pode ser negativo.");

                    } else {

                        double resultado = ConversorComprimento.centimetrosParaQuilometros(centimetros);

                        System.out.printf("Resultado: %.2f km%n", resultado);

                        historico.adicionar(
                                String.format("%.2f cm → %.2f km", centimetros, resultado)
                        );
                    }

                    break;
                }

                case 6: {

                    System.out.println("\n--- Quilômetros → Centímetros ---");

                    System.out.print("Digite o valor em quilômetros: ");

                    double quilometros = lerDouble(scanner);

                    if (quilometros < 0) {

                        System.out.println("Erro: o valor não pode ser negativo.");

                    } else {

                        double resultado = ConversorComprimento.quilometrosParaCentimetros(quilometros);

                        System.out.printf("Resultado: %.2f cm%n", resultado);

                        historico.adicionar(
                                String.format("%.2f km → %.2f cm", quilometros, resultado)
                        );
                    }

                    break;
                }

                case 0:

                    System.out.println("\nVoltando ao menu principal...");

                    break;

                default:

                    System.out.println("\nOpção inválida!");
            }
        }
    }

    public static void menuMoeda(Scanner scanner, Historico historico) {

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("\n=================================");

            System.out.println("             MOEDAS");

            System.out.println("=================================");

            System.out.println("1 - Real → Dólar");

            System.out.println("2 - Dólar → Real");

            System.out.println("3 - Real → Euro");

            System.out.println("4 - Euro → Real");

            System.out.println("0 - Voltar");

            System.out.print("\nEscolha uma opção: ");

            opcao = lerInteiro(scanner);

            switch (opcao) {

                case 1: {

                    System.out.println("\n--- Real → Dólar ---");

                    System.out.print("Digite o valor em reais: ");

                    double real = lerDouble(scanner);

                    if (real < 0) {

                        System.out.println("Erro: o valor não pode ser negativo.");

                    } else {

                        double resultado = ConversorMoeda.realParaDolar(real);

                        System.out.printf("Resultado: US$ %.2f%n", resultado);

                        historico.adicionar(
                                String.format("R$ %.2f → US$ %.2f", real, resultado)
                        );
                    }

                    break;
                }

                case 2: {

                    System.out.println("\n--- Dólar → Real ---");

                    System.out.print("Digite o valor em dólares: ");

                    double dolar = lerDouble(scanner);

                    if (dolar < 0) {

                        System.out.println("Erro: o valor não pode ser negativo.");

                    } else {

                        double resultado = ConversorMoeda.dolarParaReal(dolar);

                        System.out.printf("Resultado: R$ %.2f%n", resultado);

                        historico.adicionar(
                                String.format("US$ %.2f → R$ %.2f", dolar, resultado)
                        );
                    }

                    break;
                }

                case 3: {

                    System.out.println("\n--- Real → Euro ---");

                    System.out.print("Digite o valor em reais: ");

                    double real = lerDouble(scanner);

                    if (real < 0) {

                        System.out.println("Erro: o valor não pode ser negativo.");

                    } else {

                        double resultado = ConversorMoeda.realParaEuro(real);

                        System.out.printf("Resultado: € %.2f%n", resultado);

                        historico.adicionar(
                                String.format("R$ %.2f → € %.2f", real, resultado)
                        );
                    }

                    break;
                }

                case 4: {

                    System.out.println("\n--- Euro → Real ---");

                    System.out.print("Digite o valor em euros: ");

                    double euro = lerDouble(scanner);

                    if (euro < 0) {

                        System.out.println("Erro: o valor não pode ser negativo.");

                    } else {

                        double resultado = ConversorMoeda.euroParaReal(euro);

                        System.out.printf("Resultado: R$ %.2f%n", resultado);

                        historico.adicionar(
                                String.format("€ %.2f → R$ %.2f", euro, resultado)
                        );
                    }

                    break;
                }

                case 0:

                    System.out.println("\nVoltando ao menu principal...");

                    break;

                default:

                    System.out.println("\nOpção inválida!");
            }
        }
    }

    public static int lerInteiro(Scanner scanner) {

        while (!scanner.hasNextInt()) {

            System.out.println("Entrada inválida. Digite um número inteiro.");

            scanner.next();
        }

        return scanner.nextInt();
    }

    public static double lerDouble(Scanner scanner) {

        while (!scanner.hasNextDouble()) {

            System.out.println("Entrada inválida. Digite um número.");

            scanner.next();
        }

        return scanner.nextDouble();
    }
}