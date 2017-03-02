using System;
using System.Diagnostics;
using Gtk;
using System.Collections.Generic;
using CBingo;

public partial class MainWindow: Gtk.Window
{    
	public MainWindow (): base (Gtk.WindowType.Toplevel)
	{
		Build ();

		Table table = new Table (9, 10, true);

		IList<int> bolas = new List<int> ();
		IList<Button> buttons = new List<Button> ();
		for (int numero = 1; numero <= 90; numero ++) {
			bolas.Add (numero);
			uint index = (uint)numero - 1;
			Button button = new Button ();
			button.Label = "" + numero;
			button.Visible = true;
			uint row = index / 10;
			uint column = index % 10;
			table.Attach (button, column, column + 1, row, row + 1);
			buttons.Add (button);
		}
		table.Visible = true;
		vBoxMain.Add (table);

		Random random = new Random ();
		buttonGoForward.Clicked += delegate {
			int randomIndex = random.Next(bolas.Count);
			int bola = bolas[randomIndex];
			Console.WriteLine ("bola = " + bola);
			bolas.RemoveAt(randomIndex);
			if (bolas.Count == 0)
				buttonGoForward.Sensitive = false;

			Process.Start("espeak", " -v es " + EspeakHelper.ToEspeak(bola));
			buttons[bola - 1].ModifyBg(StateType.Normal, new Gdk.Color(0, 255, 0));
		};

	}



	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Application.Quit ();
		a.RetVal = true;
	}
}
