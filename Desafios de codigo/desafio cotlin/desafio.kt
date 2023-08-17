object ReceitFederal {
    fun CalcularImposto(salario: Double): Double {
        val aliquota = when {
            (salario >= 0 && salario <= 1100) -> 0.05
            (salario >= 1100 && salario <= 2500) -> 0.10
            else -> 0.15

            else -> TODO("Criar as condiçôes para as aliquota de 10.00% e 15.00%)
        }
        return aliquota * salario
    }
}

fun main() {
    val valoeSalario = realine()!!.toDouble();
    val valorBeneficio = realine()!!.toDouble();
    val valorImposto ReceitFederal.calcularImposto(valorSalario);
    val saida = valorSalario - valorImposto + valorBeneficio;

    println(string.format("%.2f", saida));
}