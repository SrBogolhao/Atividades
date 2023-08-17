const valorSalario = parseFloat(get());
const valorBeneFicios = parseFloat(get());

const valorImposto = calcularImposto(valorSalario);

const saida = valorSalario- valorImposto + valorBeneFicios;
print(saida.toFixed(2));

function calcularImposto(salario) {
    let aliquota;
    if (salario >= 0 && salario <=1100){
        aliquota= 0.05;
    } else if (salario >= 1100.01 && salario <=2500.00){
        aliquota = 0.10;
    } else {
        aliquota = 0.15;
    }

    //TODO
    return aliquota * salario;
}