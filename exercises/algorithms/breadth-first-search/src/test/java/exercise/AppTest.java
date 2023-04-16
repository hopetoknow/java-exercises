package exercise;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    void testBreadthFirstSearchForTrees() {
        Tree<Integer> root = Tree.of(24);
        Tree<Integer> firstRootChild = root.addChild(12);
        Tree<Integer> secondRootChild = root.addChild(7);
        Tree<Integer> childOfSecondRootChild = secondRootChild.addChild(10);
        Optional<Tree<Integer>> expected = Optional.of(secondRootChild);

        Optional<Tree<Integer>> actual = App.breadthFirstSearchForTrees(7, root);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testBreadthFirstSearchForGraphs() {
        Node<Integer> start = new Node<>(24);
        Node<Integer> firstNeighbor = new Node<>(12);
        start.connect(firstNeighbor);

        Node<Integer> neighborOfFirstNeighbor = new Node<>(8);
        firstNeighbor.connect(neighborOfFirstNeighbor);
        neighborOfFirstNeighbor.connect(start);

        Optional<Node<Integer>> expected = Optional.of(neighborOfFirstNeighbor);

        Optional<Node<Integer>> actual = App.breadthFirstSearchForGraphs(8, start);
        assertThat(actual).isEqualTo(expected);

        Optional<Node<Integer>> actual2 = App.breadthFirstSearchForGraphs(8, firstNeighbor);
        assertThat(actual2).isEqualTo(expected);

        Optional<Node<Integer>> actual3 = App.breadthFirstSearchForGraphs(8, neighborOfFirstNeighbor);
        assertThat(actual3).isEqualTo(expected);
    }
}
