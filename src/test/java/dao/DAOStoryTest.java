//package dao;
//
//import beans.Story;
//import org.junit.jupiter.api.Test;
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.time.LocalDate;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.AfterEach;
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//
//class DAOStoryTest {
//
//    private DAOStory daoStory;
//    private Connection connection;
//
//    @BeforeAll
//    public static void setUpClass() throws Exception {
//    }
//
//    @AfterAll
//    public static void tearDownClass() throws Exception {
//    }
//
//    @BeforeEach
//    public void setUp() throws Exception {
//    }
//
//    @AfterEach
//    public void tearDown() throws Exception {
//    }
//
//    @Test
//    void testCreateStory() throws SQLException {
//        // Créer un nouvel objet Story
//        Story newStory = new Story();
//        newStory.setTitle("My Test Story");
//        newStory.setContent("This is a test content");
//        newStory.setCreated(LocalDate.now());
//        newStory.setId_person(1L);  // Assurez-vous que l'id_person existe dans votre base
//
//        // Insérer cette story dans la base de données
//        daoStory.create(newStory);
//
//        // Vérifier que l'ID a bien été généré
//        assertNotNull(newStory.getId());
//
//        // Vérifier que la story existe bien dans la base de données
//        String query = "SELECT * FROM stories WHERE id_story = " + newStory.getId();
//        var resultSet = connection.createStatement().executeQuery(query);
//        assertTrue(resultSet.next());
//        assertEquals("My Test Story", resultSet.getString("title"));
//    }
//
//    @Test
//    void testUpdateStory() throws SQLException {
//        // Créer et insérer une story pour pouvoir ensuite la mettre à jour
//        Story story = new Story();
//        story.setTitle("Original Title");
//        story.setContent("Original content");
//        story.setCreated(LocalDate.now());
//        story.setId_person(1L);
//        daoStory.create(story);
//
//        // Modifier la story
//        story.setTitle("Updated Title");
//        story.setContent("Updated content");
//        daoStory.update(story);
//
//        // Vérifier que la story a bien été mise à jour
//        String query = "SELECT * FROM stories WHERE id_story = " + story.getId();
//        var resultSet = connection.createStatement().executeQuery(query);
//        assertTrue(resultSet.next());
//        assertEquals("Updated Title", resultSet.getString("title"));
//        assertEquals("Updated content", resultSet.getString("content"));
//    }
//
//    /**
//     * Test of createObject method, of class DAOStory.
//     */
//    @Test
//    public void testCreateObject() {
//        System.out.println("createObject");
//        ResultSet rs = null;
//        DAOStory instance = new DAOStory();
//        Story expResult = null;
//        Story result = instance.createObject(rs);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of create method, of class DAOStory.
//     */
//    @Test
//    public void testCreate() {
//        System.out.println("create");
//        Story story = null;
//        DAOStory instance = new DAOStory();
//        instance.create(story);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of update method, of class DAOStory.
//     */
//    @Test
//    public void testUpdate() {
//        System.out.println("update");
//        Story story = null;
//        DAOStory instance = new DAOStory();
//        instance.update(story);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of find method, of class DAOStory.
//     */
//    @Test
//    public void testFind() {
//        System.out.println("find");
//        Long id = null;
//        DAOStory instance = new DAOStory();
//        Story expResult = null;
//        Story result = instance.find(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//}
