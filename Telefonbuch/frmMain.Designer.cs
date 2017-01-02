namespace Telefonbuch
{
    partial class frmMain
    {
        /// <summary>
        /// Erforderliche Designervariable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Verwendete Ressourcen bereinigen.
        /// </summary>
        /// <param name="disposing">True, wenn verwaltete Ressourcen gelöscht werden sollen; andernfalls False.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Vom Windows Form-Designer generierter Code

        /// <summary>
        /// Erforderliche Methode für die Designerunterstützung.
        /// Der Inhalt der Methode darf nicht mit dem Code-Editor geändert werden.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(frmMain));
            this.labVorname = new System.Windows.Forms.Label();
            this.tbVorname = new System.Windows.Forms.TextBox();
            this.tbName = new System.Windows.Forms.TextBox();
            this.lanName = new System.Windows.Forms.Label();
            this.tbNummer = new System.Windows.Forms.TextBox();
            this.labNummer = new System.Windows.Forms.Label();
            this.btnSpeichern = new System.Windows.Forms.Button();
            this.btnLoeschen = new System.Windows.Forms.Button();
            this.tbEintraege = new System.Windows.Forms.RichTextBox();
            this.btn1 = new System.Windows.Forms.Button();
            this.btn2 = new System.Windows.Forms.Button();
            this.btn3 = new System.Windows.Forms.Button();
            this.btn4 = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // labVorname
            // 
            this.labVorname.AutoSize = true;
            this.labVorname.Location = new System.Drawing.Point(11, 19);
            this.labVorname.Name = "labVorname";
            this.labVorname.Size = new System.Drawing.Size(94, 28);
            this.labVorname.TabIndex = 0;
            this.labVorname.Text = "Vorname:";
            // 
            // tbVorname
            // 
            this.tbVorname.Location = new System.Drawing.Point(178, 19);
            this.tbVorname.Name = "tbVorname";
            this.tbVorname.Size = new System.Drawing.Size(403, 34);
            this.tbVorname.TabIndex = 1;
            // 
            // tbName
            // 
            this.tbName.Location = new System.Drawing.Point(178, 68);
            this.tbName.Name = "tbName";
            this.tbName.Size = new System.Drawing.Size(403, 34);
            this.tbName.TabIndex = 3;
            // 
            // lanName
            // 
            this.lanName.AutoSize = true;
            this.lanName.Location = new System.Drawing.Point(11, 68);
            this.lanName.Name = "lanName";
            this.lanName.Size = new System.Drawing.Size(68, 28);
            this.lanName.TabIndex = 2;
            this.lanName.Text = "Name:";
            // 
            // tbNummer
            // 
            this.tbNummer.Location = new System.Drawing.Point(178, 118);
            this.tbNummer.Name = "tbNummer";
            this.tbNummer.Size = new System.Drawing.Size(403, 34);
            this.tbNummer.TabIndex = 5;
            // 
            // labNummer
            // 
            this.labNummer.AutoSize = true;
            this.labNummer.Location = new System.Drawing.Point(11, 118);
            this.labNummer.Name = "labNummer";
            this.labNummer.Size = new System.Drawing.Size(151, 28);
            this.labNummer.TabIndex = 4;
            this.labNummer.Text = "Telefonnummer:";
            // 
            // btnSpeichern
            // 
            this.btnSpeichern.Location = new System.Drawing.Point(12, 192);
            this.btnSpeichern.Name = "btnSpeichern";
            this.btnSpeichern.Size = new System.Drawing.Size(150, 60);
            this.btnSpeichern.TabIndex = 6;
            this.btnSpeichern.Text = "Speichern";
            this.btnSpeichern.UseVisualStyleBackColor = true;
            this.btnSpeichern.Click += new System.EventHandler(this.btnSpeichern_Click);
            // 
            // btnLoeschen
            // 
            this.btnLoeschen.Location = new System.Drawing.Point(420, 191);
            this.btnLoeschen.Name = "btnLoeschen";
            this.btnLoeschen.Size = new System.Drawing.Size(154, 60);
            this.btnLoeschen.TabIndex = 7;
            this.btnLoeschen.Text = "Löschen";
            this.btnLoeschen.UseVisualStyleBackColor = true;
            // 
            // tbEintraege
            // 
            this.tbEintraege.Location = new System.Drawing.Point(11, 275);
            this.tbEintraege.Name = "tbEintraege";
            this.tbEintraege.Size = new System.Drawing.Size(569, 165);
            this.tbEintraege.TabIndex = 8;
            this.tbEintraege.Text = "";
           
            // frmMain
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(11F, 28F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.MenuHighlight;
            this.ClientSize = new System.Drawing.Size(593, 457);
            this.Controls.Add(this.btn4);
            this.Controls.Add(this.btn3);
            this.Controls.Add(this.btn2);
            this.Controls.Add(this.btn1);
            this.Controls.Add(this.tbEintraege);
            this.Controls.Add(this.btnLoeschen);
            this.Controls.Add(this.btnSpeichern);
            this.Controls.Add(this.tbNummer);
            this.Controls.Add(this.labNummer);
            this.Controls.Add(this.tbName);
            this.Controls.Add(this.lanName);
            this.Controls.Add(this.tbVorname);
            this.Controls.Add(this.labVorname);
            this.Font = new System.Drawing.Font("Segoe UI", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.Fixed3D;
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.Margin = new System.Windows.Forms.Padding(6);
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.Name = "frmMain";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Telefonbuch";
            this.ResumeLayout(false);
            this.PerformLayout();

        

        #endregion

        private System.Windows.Forms.Label labVorname;
        private System.Windows.Forms.TextBox tbVorname;
        private System.Windows.Forms.TextBox tbName;
        private System.Windows.Forms.Label lanName;
        private System.Windows.Forms.TextBox tbNummer;
        private System.Windows.Forms.Label labNummer;
        private System.Windows.Forms.Button btnSpeichern;
        private System.Windows.Forms.Button btnLoeschen;
        private System.Windows.Forms.RichTextBox tbEintraege;
        private System.Windows.Forms.Button btn1;
        private System.Windows.Forms.Button btn2;
        private System.Windows.Forms.Button btn3;
        private System.Windows.Forms.Button btn4;
    }
}

