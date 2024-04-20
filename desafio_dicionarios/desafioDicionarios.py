import math # importa a biblioteca math

def encontra_curso_menor_nota(disciplinas):
    #passar por todas a s disciplinas do discionario e comparar as notas 
    
    nota_menor = math.inf # atribuindo um valor infinito coma classe math.inf da biblioteca math, para inicializar a variavel menor nota
    nome_menor = "" # atribuindo um valor vazio para a string nome_menor

    for nome,(nota,_)in disciplinas.items():
        if nota < nota_menor:
            nota_menor = nota
            nome_menor = nome
    return nome_menor,nota_menor            


def encontra_curso_maior_nota(disciplinas):
    
    nota_maior = -math.inf # atribuindo um valor menos infinito usando a classe -math.inf da biblioteca math
    nome_maior = ""
    
    for nome, (nota,_)in disciplinas.items():
        if nota > nota_maior:
            nota_maior = nota
            nome_maior = nome
   
    return nome_maior,nota_maior                    

def calcular_media_ponderada(disciplinas):
    soma = 0.0
    soma_pesos = 0
    for _,(nota,peso) in disciplinas.items():
        soma += nota*peso
        soma_pesos += peso
    
    media = soma/soma_pesos
    return media
   



numero_de_cursos = int(input("digite a quantidade de disciplina\n"))

disciplinas ={} # dicionario vazio

print("digite os nomes das diciplinas + a nota e o peso,\n exemplos: disciplina nota peso ou matematica 10 2\n ")

while numero_de_cursos > 0:
    linha = input().split()

    nome_da_disciplina = linha[0]
    nota = float(linha[1])
    peso = int(linha[2])
    disciplinas[nome_da_disciplina]=(nota,peso)

    numero_de_cursos-=1;



(nome_menor,nota_menor) = encontra_curso_menor_nota(disciplinas)

(nome_maior,nota_maior) = encontra_curso_maior_nota(disciplinas)

media = calcular_media_ponderada(disciplinas)

print("Menor:%s %.1f" %(nome_menor,nota_menor))
print("Maior:%s %.1f" %(nome_maior,nota_maior))
print("Média: %.2f" %media)





# for i in range(numerodecursos):
    # i = i + 1
    # nome = input('digite o nome da disciplina: '+str(i)+'\n')   
    
    # print(numerodecursos)
    # print(i)
    
    


