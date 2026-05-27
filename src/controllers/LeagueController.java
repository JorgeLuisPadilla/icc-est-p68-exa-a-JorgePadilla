package controllers;

import models.League;

public class LeagueController {

    /**
     * FILA A - Implementar este metodo con Selection Sort ascendente.
     * Ordena el arreglo de ligas de menor a mayor segun getTotalActiveGoals().
     *
     * Nombre exacto requerido: sortSelectionAsc
     *
     * @param leagues Arreglo de ligas a ordenar
     * @return Arreglo ordenado
     */
    public League[] sortSelectionAsc(League[] leagues) {
        for (int i = 0; i < leagues.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < leagues.length; j++) {

                if (leagues[j].getTotalActiveGoals() < leagues[minIndex].getTotalActiveGoals()) {
                    minIndex = j;
                }
            }

            League temp = leagues[i];

            leagues[i] = leagues[minIndex];

            leagues[minIndex] = temp;
        }
        throw new UnsupportedOperationException("Metodo sortSelectionAsc no implementado");
    }

    /**
     * FILA B - Implementar este metodo con Insertion Sort descendente.
     * Ordena el arreglo de ligas de mayor a menor segun getTotalActiveGoals().
     *
     * Nombre exacto requerido: sortInsertionDesc
     *
     * @param leagues Arreglo de ligas a ordenar
     * @return Arreglo ordenado
     */
    public League[] sortInsertionDesc(League[] leagues) {
        // TODO: Implementar (solo si su fila es B)
        throw new UnsupportedOperationException("Metodo sortInsertionDesc no implementado");
    }

    /**
     * TODOS - Implementar busqueda binaria por goles activos totales.
     *
     * El arreglo recibido ya fue ordenado con el metodo de su fila.
     * Implemente la busqueda conforme al orden que aplico:
     * - Fila A: arreglo ascendente, use logica de busqueda ascendente.
     * - Fila B: arreglo descendente, use logica de busqueda descendente.
     *
     * Nombre exacto requerido: binarySearchByTotalActiveGoals
     *
     * @param args          Arreglo de ligas ya ordenado
     * @param totalActiveGoals Total de goles activos a buscar
     * @return La liga encontrada, o null si no existe
     */
    public League binarySearchByTotalActiveGoals(String[] args, int totalActiveGoals, boolean isActive) {

        int left = 0;
        int right = args.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            int current = args[mid].getTotalActiveGoals();

            if (current == totalActiveGoals) {

                return args[mid];
            }

            if (isActive) {

                if (totalActiveGoals < current) {

                    right = mid - 1;

                } else {

                    left = mid + 1;
                }

            } else {

                if (totalActiveGoals > current) {

                    right = mid - 1;

                } else {

                    left = mid + 1;
                }
            }
        }
        throw new UnsupportedOperationException("Metodo binarySearchByTotalActiveGoals no implementado");
    }

    /**
     * Imprime el arreglo de ligas en consola.
     *
     * @param leagues Arreglo de ligas a imprimir
     */
    public void printLeagues(League[] leagues) {

    }
}
