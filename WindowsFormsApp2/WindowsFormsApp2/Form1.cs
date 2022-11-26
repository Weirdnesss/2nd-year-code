using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.Odbc;
using System.Data.SqlClient;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
using static System.Windows.Forms.VisualStyles.VisualStyleElement;

namespace WindowsFormsApp2
{
    public partial class Form1 : Form
    {
        public OdbcConnection connection = new OdbcConnection();
        public OdbcCommand cmd = new OdbcCommand();
        public OdbcDataReader dr, dr1;
        public OdbcDataAdapter da;

        private void Form1_Load(object sender, EventArgs e)
        {
            connection.Close();
            connection.ConnectionString = "DRIVER={MySQL ODBC 5.1 Driver};Server=localhost;Port=3306;DATABASE=enrollment;uId=root;pwd=root;OPTION=3;";
            connection.Open();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            using (SqlConnection sqlCon = new SqlConnection(ConnectionString))
            {
            string Date = dateTimePicker1.Value.ToString("yyyy-MM-dd");
            cmd = new OdbcCommand(string.Format("INSERT INTO student_list (student_id,student_name,address,contact_number,birthdate) VALUES('{0}', '{1}', '{2}', '{3}', '{4}')", textBox1.Text, textBox2.Text, textBox3.Text, dateTimePicker1.Text, Date), connection);
            cmd.ExecuteNonQuery();
            MessageBox.Show("Record save");
            }
            
     
            
        }

        

        //public DataTable dt = new DataTable();
        //public DataSet ds = new DataSet();

        public Form1()
        {
            InitializeComponent();
        }


    }
}
