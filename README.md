# Virusland
Entrega provisional en procés.

# Notes de la simulació
```
tick():
    1. aplicar vacunes (des del main s'hauràn aplicat)
    2. moviments habitants
        a) confinaments
        b) moviments en sí
    3. propagació dels virus
    4. mutacions dels virus
```

# Notes de funcionament programa
## Virus
(processos paral·lels)

1. COMENÇA -> temps incubació -> durada_mitjana_malaltia (taxa_mortalitat!!) -> durada_periode_immunitat.
2. COMENÇA -> temps latència -> durada_període_contagi (taxa_contagi!!).

## Mutacions
(per regió i virus)

tanta gent té el virus -> aplicar taxa mutació.

> dependrà de taxa de contagi, però també de la densitat de població d’un territori i de la mobilitat dels seus habitants (d’aquests temes en parlarem més endavant)

també hem de tenir en compte la **prevalença**: major taxa contagi > probabilitat_desenvolupar_malaltia > taxa_mortalitat > ordre_alfabètic.

### Nomenclatura
#### Mutació simple
grip -> grip1

grip1 -> grip2

#### Mutació conjunta
grip i grip2 -> grip_grip2

## 
