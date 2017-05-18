using System;
using Gtk;

public partial class MainWindow: Gtk.Window
{	
	public MainWindow (): base (Gtk.WindowType.Toplevel)
	{
		Build ();
		Table table = new Table (9, 10, true);

		for (uint index = 0; index < 30; index++) {
			uint row = index / 10;
			uint column = index % 10;
			int numero = (int)index + 1;
			Button button = new Button ();
			button.Label = numero.ToString();
			button.Visible = true;
			table.Attach (button, column, column + 1, row, row + 1);


		}
		table.Visible = true;
		vBoxMain.Add (table);


	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Application.Quit ();
		a.RetVal = true;
	}

	protected void OnButton2Clicked (object sender, EventArgs e)
	{

		labelSaludo.Text = "Hola " + entryNombre.Text + ", esta es tu primer app en Monodevelop!" +
			"\nOlvidate de sacar + de un 5 en el curso!" +
				"\nlo de abajo es simplemente una tabla :)";

	}
}
