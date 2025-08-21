## 1. ¿Qué es un repositorio en Git y cómo se diferencia de un proyecto “normal”?

Un repositorio Git es una carpeta de un proyecto que está bajo control de versiones. 
Contiene:

El código fuente.

La carpeta oculta .git donde Git guarda el historial de cambios, configuraciones y commits.

🔹 Diferencia:
Un proyecto normal solo tiene archivos, mientras que un repositorio Git permite rastrear cambios, volver a versiones anteriores y trabajar en equipo de forma controlada.

## 2. ¿Cuáles son las tres áreas principales de Git y qué papel cumple cada una?

Working Directory (directorio de trabajo):
Donde editas archivos normalmente en tu PC.

Staging Area (index):
Zona temporal donde seleccionas qué cambios quieres incluir en el próximo commit (git add).

Repository (repositorio local):
Aquí Git almacena los commits ya confirmados.

-- Flujo:
Trabajas → git add → git commit.

## 3. ¿Cómo representa Git los cambios internamente?

Git usa objetos:

Blob: Contenido de un archivo (sin nombre, solo datos).

Tree: Estructura de directorios y archivos (como carpetas).

Commit: Apunta a un tree y guarda autor, mensaje y referencia al commit anterior.

Tag: Etiqueta que marca un commit específico (ej: versión 1.0).

## 4. ¿Cómo se crea un commit y qué información almacena?

Un commit se crea con:

git commit -m "Mensaje"


Un commit guarda:

Autor y fecha.

Mensaje descriptivo.

Referencia al commit padre.

Instantánea de los archivos (tree).

## 5. ¿Cuál es la diferencia entre git pull y git fetch?

git fetch: Trae los cambios del remoto, pero NO los fusiona con tu rama actual.

git pull: Hace un fetch + merge (trae y aplica los cambios automáticamente).

## 6. ¿Qué es un branch en Git y cómo Git gestiona los punteros a commits?

Un branch (rama) es un puntero que apunta a un commit.

Ejemplo: main apunta al último commit en la rama principal.

Cuando creas una rama, Git solo crea un nuevo puntero.

Git usa el puntero HEAD para indicar en qué rama/commit estás trabajando.

## 7. ¿Cómo se realiza un merge y qué conflictos pueden surgir?

git merge ramaX combina cambios de otra rama en la actual.

Si los cambios afectan las mismas líneas de un archivo → conflicto.

Se resuelve editando manualmente el archivo, luego:

git add archivo_resuelto
git commit

## 8. ¿Cómo funciona el área de staging (git add) y qué pasa si omito este paso?

git add archivo → prepara el archivo para el commit.

Si lo omites, Git no incluirá los cambios en el commit.
(El commit solo guardará lo que está en el staging area).

## 9. ¿Qué es el archivo .gitignore y cómo influye en el seguimiento?

Archivo de texto donde defines qué archivos/carpetas Git debe ignorar.
Ejemplo:

*.log
node_modules/
secret.txt


Esto evita que se suban archivos innecesarios o sensibles.

## 10. ¿Cuál es la diferencia entre un commit amend y un nuevo commit?

git commit --amend: Modifica el último commit (mensaje o archivos).

Nuevo commit: Crea un historial adicional.

 --amend se usa para corregir el último commit sin generar uno nuevo.

## 11. ¿Cómo se utiliza git stash y en qué escenarios es útil?

git stash: Guarda cambios temporales sin hacer commit.

Útil cuando quieres cambiar de rama sin perder lo que estabas editando.

Recuperar:

git stash pop   # Aplica y elimina el stash
git stash list  # Lista stashes

## 12. ¿Qué mecanismos ofrece Git para deshacer cambios?

git reset: Mueve HEAD a otro commit (puede borrar cambios del historial).

git revert: Crea un nuevo commit que revierte los cambios de otro.

git checkout archivo: Recupera un archivo desde la última versión confirmada.

## 13. ¿Cómo funciona la configuración de remotos (origin, upstream) y qué comandos uso para forks?

origin: Nombre por defecto del repositorio remoto original.

upstream: Repositorio del que se hizo un fork.

Comandos útiles:

git remote -v               # Ver remotos
git remote add upstream URL # Agregar remoto upstream
git fetch upstream          # Traer cambios del upstream
git merge upstream/main     # Actualizar tu rama con upstream

## 14. ¿Cómo puedo inspeccionar el historial de commits?

git log: Ver historial completo.

git log --oneline --graph: Ver ramas y commits en gráfico.

git diff: Ver diferencias entre commits o archivos.

git show <commit>: Ver detalles de un commit específico.
