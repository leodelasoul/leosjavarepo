using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Telefonbuch
{
    public partial class frmMain : Form
    {
        string sVorname;
        string sName;
        string sNummer;
        public frmMain()
        {
            InitializeComponent();
        
        //Speicher-Knopf
        private void btnSpeichern_Click(object sender, EventArgs e)
        {
            sVorname = this.tbVorname.Text;
            sName = this.tbName.Text;
            sNummer = this.tbNummer.Text;

            string sEintrag = "Vorname: " + sVorname + "\nName: " + sName + "\nNummer: " + sNummer + "\n\n";

            this.tbEintraege.Text += sEintrag;
        


        }












