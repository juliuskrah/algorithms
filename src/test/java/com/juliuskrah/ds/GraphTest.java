package com.juliuskrah.ds;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

class GraphTest {
        private List<Integer> capture(Runnable action) {
                List<Integer> visited = new ArrayList<>();
                Logger logger = Logger.getLogger(Graph.class.getName());
                Handler handler = new Handler() {
                        @Override
                        public void publish(LogRecord record) {
                                try {
                                        visited.add(Integer.parseInt(record.getMessage()));
                                } catch (NumberFormatException ignore) {
                                        // ignore non-numeric messages
                                }
                        }

                        @Override
                        public void flush() {
                        }

                        @Override
                        public void close() throws SecurityException {
                        }
                };
                logger.addHandler(handler);
                logger.setUseParentHandlers(false);
                try {
                        action.run();
                } finally {
                        logger.removeHandler(handler);
                }
                return visited;
        }

        @Test
        void testBfs() {
                Graph g = new Graph(4);
                g.addEdge(0, 1);
                g.addEdge(0, 2);
                g.addEdge(1, 2);
                g.addEdge(2, 0);
                g.addEdge(2, 3);
                g.addEdge(3, 3);
                List<Integer> traversal = capture(() -> g.bfs(2));
                assertEquals(List.of(2, 0, 3, 1), traversal);
        }

        @Test
        void testDfs() {
                Graph g = new Graph(4);
                g.addEdge(0, 1);
                g.addEdge(0, 2);
                g.addEdge(1, 2);
                g.addEdge(2, 0);
                g.addEdge(2, 3);
                g.addEdge(3, 3);
                List<Integer> traversal = capture(g::dfs);
                assertEquals(List.of(0, 1, 2, 3), traversal);
        }
}
