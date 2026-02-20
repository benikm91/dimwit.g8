# DimWit Project

## Installation

### Global Requirements
- Install Python's [UV](https://github.com/astral-sh/uv)
- Install DimWit SBT plugin (see [Publish DimWit Plugin locally](#publish-dimwit-plugin-locally))

### Install this project

Setup python project (requires `uv`):

```bash
sbt dimwitPythonSync
```

Setup necessary environment variables:

```bash
echo "export SCALAPY_PYTHON_PROGRAMNAME=\$(pwd)/.venv/bin/python" > .envrc
echo "export SCALAPY_PYTHON_LIBRARY=python3.13" >> .envrc
echo "export LD_LIBRARY_PATH=\$(.venv/bin/python -c 'import sysconfig; print(sysconfig.get_config_var(\"LIBDIR\"))')" >> .envrc
```

Source environment variables:

```bash
source .envrc
```

## Publish DimWit Plugin locally


Install DimWit sbt plugin (can be removed when we make this public)

```bash
git clone https://github.com/benikm91/sbt-scalapy-uv-plugin.git
cd sbt-scalapy-uv-plugin
sbt publishLocal
```
