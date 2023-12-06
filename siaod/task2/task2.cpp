#include <iostream>
#include <fstream>
#include <cstring>

using namespace std;

struct License
{
    //licenseNumber;
    //char licenseName[50];
    string licenseFounder;
    //bool licenseStatus;
};

int main()
{
    License read1 = {"f"};

    fstream output_file("license.bin", ios::binary | ios::in | ios::out);
    if (!output_file.is_open())
    {
        cout << "File is not open!" << endl;
        return 1;
    }

    output_file.seekp(0 * sizeof(License));
    output_file.write(reinterpret_cast<char*>(&read1), sizeof(read1));
    output_file.close();

    cout << "programm is finish!";
}