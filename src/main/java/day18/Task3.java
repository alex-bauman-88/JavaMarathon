/* Вам необходимо создать двоичное дерево поиска, изображенное на картинке выше.

Для этого создайте класс “Узел” (англ. Node), объекты которого будут содержать само значение узла
и поля-ссылки на два других узла (левый и правый сын).
Затем, создайте корневой (англ. root) узел (со значением 20).
После этого, необходимо реализовать метод, который будет добавлять новые узлы в ваше дерево.
Этот метод должен принимать в качестве аргументов добавляемое значение и ссылку на корень дерева.
Проходясь по дереву, он должен вставлять новый узел в правильное место дерева.

Когда двоичное дерево, изображенное выше, будет создано, необходимо используя рекурсию вывести в
консоль все числа из этого двоичного дерева поиска в отсортированном виде. Ваше рекурсивное решение
должно работать для любого корректного двоичного дерева поиска. Этот алгоритм называется “обход в
глубину” (иногда называют “поиск в глубину”).
Ваш рекурсивный метод (пусть он будет называться dfs) должен в качестве единственного аргумента
принимать ссылку на корень дерева (root).

Вызов: dfs(root);
Вывод в консоль: 5 8 11 14 15 16 18 20 22 23 24 27 150
   */

package day18;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);

        int[] numbers = {14, 23, 11, 16, 22, 27, 5, 15, 18, 24, 150, 8};

        for (int number : numbers)
            addNode(root, number);

        dfs(root);

    }

    public static Node addNode(Node currentNode, int number) {
        if (currentNode == null)
            return new Node(number);

        if (currentNode.getNumber() == number)
            return currentNode;

        if (currentNode.getNumber() > number)
            currentNode.setLeftNode
                    (addNode(currentNode.getLeftNode(), number));

        if (currentNode.getNumber() < number)
            currentNode.setRightNode
                    (addNode(currentNode.getRightNode(), number));

        return currentNode;
    }

    // depth first search
    public static void dfs(Node currentNode) {

        if (currentNode == null)
            return;
        dfs(currentNode.getLeftNode());
        System.out.print(currentNode.getNumber() + " ");
        dfs(currentNode.getRightNode());
    }
}