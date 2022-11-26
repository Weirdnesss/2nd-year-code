using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;

namespace WindowsFormsApp2
{
    public partial class Dashboard : Form
    {
        public Dashboard()
        {
            InitializeComponent();
        }

        private void subjectToolStripMenuItem_Click(object sender, EventArgs e)
        {
            
        }

        private void studentToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Form1 stud = new Form1();
            stud.Show();
        }
    }
}
