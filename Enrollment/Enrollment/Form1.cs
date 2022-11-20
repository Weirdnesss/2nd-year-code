using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.Odbc;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Enrollment
{
    public partial class Form1 : Form
    {

    public OdbcConnection connection = new OdbcConnection();
    public OdbcCommand cmd = new OdbcCommand();
    public OdbcDataReader dr, dr1;
    public OdbcDataAdapter da;
    public DataTable dt = new DataTable();
    public DataSet ds = new DataSet();
    public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            cmd = new OdbcCommand("insert into student_list (student_id,student_name,address,contact_number,bday) values('" + textBox1.Text + "', '" + textBox2.Text + "', '" + textBox3.Text + "', '" + textBox4.Text + "', '" + dateTimePicker1.Value + "')", connection);
            cmd.ExecuteNonQuery();
            MessageBox.Show("Record save");
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            connection.Close();
            connection.ConnectionString = "DRIVER={MySQL ODBC 5.1 Driver};Server=localhost;Port=3306;DATABASE=enrollment;uId=root;pwd=root;OPTION=3;";
            connection.Open();
        }

    }
}
